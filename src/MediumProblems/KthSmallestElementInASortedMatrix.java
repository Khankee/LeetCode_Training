package MediumProblems;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {

    }

    public static int kthSmallest(int[][] matrix, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int[] m : matrix){
            for(int i : m){
                heap.add(i);
            }
        }

        for(int i = 1; i < k; i++){
            heap.poll();
        }

        return heap.poll();
    }
}
