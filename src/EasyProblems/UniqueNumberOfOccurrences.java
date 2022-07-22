package EasyProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {

        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean a = UniqNumberOfOccurrence(arr);
        System.out.println(a);
    }

    public static boolean UniqNumberOfOccurrence(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}
