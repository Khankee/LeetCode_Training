package HardProblems;

public class FindMedianSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,11};
        int[] nums2 = {6,7,8,9,10};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        if("ne" == "ne"){
            System.out.println("s");
            String dd = "a";
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int indexOne = 0;
        int indexTwo = 0;
        int med1 = 0;
        int med2 = 0;
        for (int i = 0; i <= (nums1.length + nums2.length) / 2; i++){
            med1 = med2;
            if (indexOne == nums1.length) {
                med2 = nums2[indexTwo];
                indexTwo++;
            } else if (indexTwo == nums2.length) {
                med2 = nums1[indexOne];
                indexOne++;
            } else if(nums1[indexOne] < nums2[indexTwo]){
                med2 = nums1[indexOne];
                indexOne++;
            }
            else{
                med2 = nums2[indexTwo];
                indexTwo++;
            }
        }

        if ((nums1.length+nums2.length)%2 == 0) {
            return (float)(med1+med2)/2;
        }

        return med2;

    }
}
