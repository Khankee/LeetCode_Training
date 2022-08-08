package Contest.No305;

public class NumberOfArithmeticTriplets {

    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        System.out.println(arithmeticTriplets(nums, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff){
        int res = 0;


        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                if(Math.abs(nums[i] - nums[j]) == diff){
                    for(int k = i + 2; k < nums.length; k++){
                        if(Math.abs(nums[j] - nums[k]) == diff){
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }
}
