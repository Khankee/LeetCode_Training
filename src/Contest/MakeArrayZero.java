package Contest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakeArrayZero {
    public static void main(String[] args) {

    }

    public int minimumOperation(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int subNum = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0) continue;
            if(nums[i] != subNum){
                subNum = nums[i];
                count++;
            }
        }
        return count;
    }
}
