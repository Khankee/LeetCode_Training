package MediumProblems;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        rotate(nums, 5);
        System.out.println(Arrays.toString(nums));

        int k = 5;
        k %= nums.length;
        System.out.println(k);
    }

    //think--
    public static void rotate(int[] nums, int k){
        k %= nums.length;
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
