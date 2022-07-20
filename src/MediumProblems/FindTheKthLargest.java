package MediumProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FindTheKthLargest {
    public static void main(String[] args) {

        int[] nums = {5,3,7,2,4,1};
        System.out.println(findKthLargest2(nums,3));
    }

    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int n : nums){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        return heap.poll();
    }

    public static int findKthLargest2(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
