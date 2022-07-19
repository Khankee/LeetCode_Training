package EasyProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int values : nums) {
            list.add(values);
        }

        Set<Integer> setList = new HashSet<>(list);

        if(setList.size() == list.size()){
            return false;
        }
        return true;
    }

    public static boolean containsDuplicateImproved(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

}
