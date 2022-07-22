package EasyProblems;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    //[1,2,2,3,4,5,5,5,5,6,7,7] -> [1,2,3,4,5,6,7] k=8
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
