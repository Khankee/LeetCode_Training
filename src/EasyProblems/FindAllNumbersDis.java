package EasyProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDis {
    public static void main(String[] args) {

    }

    public static List<Integer> findDisappearedNumbers(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for (int val : nums){
            set.add(val);
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)) res.add(i);
        }

        return res;
    }
}
