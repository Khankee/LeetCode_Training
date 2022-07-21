package MediumProblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindTheKthLargest {
    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest2(nums,2));
    }

    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : nums){
            heap.add(val);
        }
        System.out.println(Arrays.toString(heap.toArray()));

        for (int l = 1; l < k; l++){
            heap.poll();
        }
        return heap.poll();
    }

    public static int findKthLargest2(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int n : nums){
            heap.add(n);
            System.out.println(Arrays.toString(heap.toArray()));
            if(heap.size() > k){
                heap.poll();
            }
        }

        return heap.poll();
    }


    public static int findKthLargest3(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
