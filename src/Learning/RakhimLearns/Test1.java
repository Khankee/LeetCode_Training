package Learning.RakhimLearns;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {2,6,2,5,2,1,6,23,1};
        //System.out.println(maxNumber(nums));
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int val : nums){
            MaxHeap.offer(val);
        }

        while(!MaxHeap.isEmpty()){
            System.out.println(MaxHeap.poll());
        }
    }

    public static int maxNumber(int[] nums){
        int max = 0;
        for (int num : nums) if (max < num) max = num;
        return max;
    }


}
