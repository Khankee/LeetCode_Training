package EasyProblems;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {3,4,0,5,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int pos = 0;
        for (int val : nums){
            if(val != 0) nums[pos++] = val;
        }
        while(pos < nums.length){
            nums[pos++] = 0;
        }
    }
}
