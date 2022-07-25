package Learning;

public class XOR {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,1,1,5};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
