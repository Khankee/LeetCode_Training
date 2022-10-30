
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] split = scan.nextLine().split(" ");
        int size = Integer.parseInt(split[0]);
        int weights = Integer.parseInt(split[1]);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int[] nums = new int[size];
        for(int i = 0 ; i < size;i++){
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);

        for(int i = nums.length - 1; i >= nums.length - weights; i--){
            min.offer(nums[i]);
        }

        for(int i = nums.length - 1 - weights; i >= 0; i--){
            int container = min.poll() + nums[i];
            min.offer(container);
        }
        int max = 0;
        while(!min.isEmpty()){
            max = Math.max(max , min.poll());
        }
        System.out.println(max);
    }
}
