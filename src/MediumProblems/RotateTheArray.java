package MediumProblems;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        rotate(nums, 4);
        System.out.println(Arrays.toString(nums));
    }

    //[1,2,3,1 tmp1,5,6,7] k = 3
    //[0,1,2,3,4,5,6] [i + 3] if i = 4 and length is 7 so 4 + 3 = 7 > 6 i - len + k 4 - 7 + 3 = 0
    public static void rotate(int[] nums, int k){
        for(int i = 0 ; i < k; i++){
            int tmp1 = nums[i];
            int tmp2 = nums[i];
            boolean reversed = true;
            int index = i;
            int count = nums.length / 2;

            while(count > 0){
                if(index + k >= nums.length){index = index - nums.length + k;}
                else {index += k;}

                if(reversed){
                    tmp1 = nums[index];
                    nums[index] = tmp2;
                    reversed = false;
                } else {
                    tmp2 = nums[index];
                    nums[index] = tmp1;
                    reversed = true;
                }
                count--;
            }
        }
    }
}
