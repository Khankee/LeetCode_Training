import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MyVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt() + 1;
        StringBuilder row = new StringBuilder();
        for(int i = rows; i > 0; i--)row.append(i).append(" ");
        for(int i = 2; i <= rows; i++)row.append(i).append(" ");
        for(int i = 1; i < rows; i++){
            String tempRow = row.toString();
            for(int j = rows; j > i; j--)tempRow = j > 9 ? tempRow.replaceAll(j + "", "  "): tempRow.replaceAll(j + "", " ");
            System.out.println(tempRow);
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int i = 0;
        for(int[] xy : points){
            int sum = xy[0] * xy[0] + xy[1] * xy[1];
            map.put(sum,i);
            heap.offer(sum);
            i+=1;
        }
        int[][] res = new int[k][2];
        i = 0;
        while(k > 0){
            int num = heap.poll();
            int idx = map.get(num);
            res[i] = points[idx];
            k-=1;
            i+=1;
        }
        return res;
    }
}
