package Learning.BFS;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

    }

    public static boolean validPath(int n, int[][] edges, int source, int destination){

        List<List<Integer>> adjacency_list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adjacency_list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adjacency_list.get(edge[0]).add(edge[1]);
            adjacency_list.get(edge[1]).add(edge[0]);
        }

        Deque<Integer> queue = new LinkedList<>();
        queue.add(source);
        boolean[] seen = new boolean[n];
        Arrays.fill(seen, false);
        seen[source] = true;

        while (!queue.isEmpty()){

            int node = queue.poll();

            if(node == destination){
                return true;
            }


            for (int neighbor : adjacency_list.get(node)){
                if(!seen[neighbor]){
                    seen[neighbor] = true;
                    queue.add(neighbor);
                }
            }

        }


        return false;
    }
}
