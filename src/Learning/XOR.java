package Learning;

public class XOR {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,1,1,5};
        //System.out.println(singleNumber(nums));
        System.out.println(countOne(20000));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
                result ^= i;
        }
        return result;
    }
    public static int countOne(int n){
        int count =0;
        while (count < 10){
            n = n & (n-1);
            System.out.println(n);
            count++;
        }
        return count;
    }
}
