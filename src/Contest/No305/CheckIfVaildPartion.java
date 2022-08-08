package Contest.No305;

import java.util.Arrays;

public class CheckIfVaildPartion {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2};
        System.out.println(validPartition(nums));
    }

    public static boolean validPartition(int[] nums){
        boolean[] dp = new boolean[nums.length+1];
        dp[0]=true;
        for (int i = 2; i <= nums.length; i++){
            dp[i]|=nums[i-1]==nums[i-2] && dp[i-2]; // cond 1
            dp[i]|= i>2 && nums[i-1] == nums[i-2] && nums[i-2] == nums[i-3] && dp[i-3]; // cond 2
            dp[i]|= i>2 && nums[i-1]-nums[i-2]==1 && nums[i-2]-nums[i-3]==1 && dp[i-3]; // cond 3
        }
        return dp[nums.length];
    }
}
