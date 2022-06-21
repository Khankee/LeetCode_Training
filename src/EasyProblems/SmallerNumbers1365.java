package EasyProblems;

import java.util.Arrays;

public class SmallerNumbers1365 {

    //Brute force upperBound O(n^2)
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int len = nums.length;
        int[] res = new int[len];
        int count = 0;

        for(int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                if(i == j) continue;
                if(nums[i] > nums[j]) count++;
            }
            res[i] = count;
            count = 0;
        }

        return res;
    }

    //Improved lowerBound O(n)
    public static int[] smallerNumbersThanCurrent2(int[] nums){
        int[] res = new int[nums.length];
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= 100; i++){
            count[i] += count[i - 1];
        }

        for (int i = 0; i < res.length; i++){
            if(nums[i] == 0) res[i] = 0;
            else res[i] = count[nums[i] - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3,9};
        long timeOne = System.nanoTime();
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        long timeTwo = System.nanoTime();
        System.out.println(timeTwo - timeOne);
        long timeThree = System.nanoTime();
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums)));
        long timeFour = System.nanoTime();
        System.out.println(timeFour - timeThree);
    }
}
