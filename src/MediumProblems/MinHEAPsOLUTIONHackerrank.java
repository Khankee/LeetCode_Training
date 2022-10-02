package MediumProblems;

import java.lang.reflect.Array;
import java.util.*;

public class MinHEAPsOLUTIONHackerrank {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(reduce(list));
        System.out.println(change(10000));
        int[] arr = {1,2,3,4,5};
        System.out.println(findClosestElements(arr, 4, 3));
    }

    public static int reduce(List<Integer> num){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int val : num){
            heap.offer(val);
        }
        int minTotal = 0;
        while(!heap.isEmpty()){
            int firstVal = heap.poll();
            if(heap.isEmpty()){
                break;
            } else {
                int secondVal = heap.poll();
                int sum = secondVal + firstVal;
                minTotal += sum;
                heap.offer(sum);
            }
        }

        return minTotal;
    }

    public static int change(int base10){
        String binary = Integer.toBinaryString(base10);
        //System.out.println(binary);
        base10 = ~base10;
        String revertedBinary = Integer.toBinaryString(base10).substring(32 - binary.length());
        //System.out.println(revertedBinary);

        return Integer.parseInt(revertedBinary, 2);
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Double[]> heap = new PriorityQueue<>((o, y) -> {
            if(!Objects.equals(o[0], y[0])) {
                return Double.compare(o[0], y[0]);
            }
            return 0;
        });

        if(arr[0] > x || arr[arr.length - 1] < x){
            for(int i = 0; i < arr.length; i++){
                double pos = Math.abs(arr[i] - x);
                Double[] temp = {pos, (double) i};
                heap.offer(temp);
            }
        } else {
            for(int i = 0; i < arr.length; i++){
                double pos = Math.abs(arr[i] - x);
                Double[] temp;

                if(arr[i] < x){
                    temp = new Double[]{pos, (double) i};
                }else {
                    temp = new Double[]{pos + 0.1, (double) i};
                }
                heap.offer(temp);
            }
        }


        for(int i = 0; i < k; i++){
            int idx = (int)Math.round(heap.poll()[1]);
            result.add(arr[idx]);
        }

        Collections.sort(result);
        return result;
    }
}
