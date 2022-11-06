package Contest.No318;

import java.util.HashMap;

public class asas {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(nums,3));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        long[] dp = new long[nums.length - k + 1];
        dp[0] = 0;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }
        if(map.size() == k){
            dp[0] = sum;
        }
        int idx = 1;
        int left = 0;
        for(int right = k; right < nums.length; right++){
            sum += nums[right];
            if(map.containsKey(nums[right])){
                map.put(nums[right],map.get(nums[right]) + 1);
            } else {
                map.put(nums[right], 1);
            }
            int count = map.get(nums[left]);
            if(count == 1){
                map.remove(nums[left]);
            } else {
                map.put(nums[left],map.get(nums[left]) - 1);
            }
            sum -= nums[left];
            if(map.size() == k){
                dp[idx] = Math.max(dp[idx - 1], sum);
            } else {
                dp[idx] = dp[idx - 1];
            }
            idx +=1;
            left += 1;
        }

        return dp[idx -1];
    }
}
