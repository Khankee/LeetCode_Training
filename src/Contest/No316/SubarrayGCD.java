package Contest.No316;

import java.util.Arrays;

public class SubarrayGCD {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= k){
                for(int j = i; j < nums.length; j++){
                    if(nums[j] < k)break;
                    int[] copy = Arrays.copyOfRange(nums, i, j + 1);
                    int gcdValue = findGCD(copy);
                    if(gcdValue == k)count +=1;
                }
            }
        }

        return count;
    }

    int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    int findGCD(int[] arr){
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }
}
