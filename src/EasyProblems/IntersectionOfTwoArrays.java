package EasyProblems;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3,8,9,3};
        int[] nums2 = {1,4,3,0};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
