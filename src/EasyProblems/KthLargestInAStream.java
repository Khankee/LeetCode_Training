package EasyProblems;

import java.util.PriorityQueue;

public class KthLargestInAStream {
    private static int k;
    private PriorityQueue<Integer> heap;

    public KthLargestInAStream(int k, int nums[]){
        this.k = k;
        heap = new PriorityQueue<>();
        for(int val : nums){
            heap.offer(val);
        }

        while(heap.size() > k){
            heap.poll();
        }
    }
    public int add(int val){
        heap.offer(val);
        if(heap.size() > k){
            heap.poll();
        }
        return heap.peek();
    }
}
