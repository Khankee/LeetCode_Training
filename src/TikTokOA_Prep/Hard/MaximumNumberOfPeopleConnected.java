package TikTokOA_Prep.Hard;

import java.util.*;

public class MaximumNumberOfPeopleConnected {

    public static void main(String[] args) {
        int n = 9;
        int[][] edges = {{0,1},{1,2},{2,3},{3,4},{5,6},{6,7},{7,8},{4,7},{2,5}};
        System.out.println(maxNumber(n,edges));
    }

    public static int maxNumber(int n, int[][] edges){
        List<List<Integer>>  adj_list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj_list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj_list.get(edge[0]).add(edge[1]);
            adj_list.get(edge[1]).add(edge[0]);
        }

        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] seen = new boolean[n];
        Arrays.fill(seen, false);

        int max = 0;
        for(int i = 0; i < n; i++){
            if(seen[i])continue;
            stack.push(i);
            seen[i] = true;
            int count = 1;
            for(int neighbours : adj_list.get(i)){
                stack.push(neighbours);
            }
            while(!stack.isEmpty()){
                int node = stack.pop();
                if(seen[node])continue;
                seen[node] = true;

                count += 1;
                for (int neighbor : adj_list.get(node)) {
                    stack.push(neighbor);
                }
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
