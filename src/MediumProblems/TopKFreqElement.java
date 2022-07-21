package MediumProblems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFreqElement {
    public static void main(String[] args) {

    }

    // [1,1,1,1,2,2,2,3,3,4,5,6] k = 3 all n elements (lower bounder)  1 -> 4 : 2 -> 3 : 3 -> 2 : 4 -> 1 ...
    // [1,2,3]

    // Map -> Key - 1 : 4
    // Map -> Key - 2 : 3
    // Map -> Key - 3 : 2
    // Map -> Key - 4 : 1


    public static int[] topKFrequent(int[] nums, int k){
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : nums){
            map.put(val, map.getOrDefault(val,0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (n1,n2) -> map.get(n1) - map.get(n2));

        for (int num : map.keySet()){
            heap.add(num);
            if(heap.size() > k) heap.poll();
        }

        for (int i = k - 1; i >= 0; i--){
            result[i] = heap.poll();
        }

        return result;
    }
}
