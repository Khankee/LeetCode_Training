package EasyProblems;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left <= right){
            mid = (right + left) / 2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }
}
