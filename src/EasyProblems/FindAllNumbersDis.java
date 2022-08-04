package EasyProblems;

import java.util.*;

public class FindAllNumbersDis {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        heap.add(10);
        heap.add(2);
        heap.add(100);

        int a = heap.poll();
        System.out.println(a);
        System.out.println(heap.poll());
        System.out.println(heap.poll());
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
