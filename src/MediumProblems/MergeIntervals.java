package MediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals ={{0,3},{0,1},{0,2},{1,9}, {2,5}, {10,11},{12,20}, {19,20}};
        System.out.println(merge(intervals));
    }


    public static LinkedList<int[]> merge(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged;
    }
}
