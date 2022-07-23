package MediumProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    //[1,2,3,1 tmp1,5,6,7] k = 3
    //[0,1,2,3,4,5,6] [i + 3] if i = 4 and length is 7 so 4 + 3 = 7 > 6 i - len + k 4 - 7 + 3 = 0
    public static void rotate(int[] nums, int k){
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
