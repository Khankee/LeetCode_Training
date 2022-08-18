package MediumProblems;

import java.util.*;

public class ReduceArraySizeToTheHalf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr){
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        for (int num : arr) {
            if (!countsMap.containsKey(num)) {
                countsMap.put(num, 1);
                continue;
            }
            countsMap.put(num, countsMap.get(num) + 1);
        }

        // Reverse sort a list of the Map values.
        List<Integer> counts = new ArrayList<>(countsMap.values());
        Collections.sort(counts);
        Collections.reverse(counts);

        int numbersRemovedFromArr = 0;
        int setSize = 0;
        for (int count : counts) {
            numbersRemovedFromArr += count;
            setSize += 1;
            if (numbersRemovedFromArr >= arr.length / 2) {
                break;
            }
        }

        return setSize;
    }
}
