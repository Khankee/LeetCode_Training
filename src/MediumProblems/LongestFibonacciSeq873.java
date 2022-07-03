package MediumProblems;

import java.util.HashSet;

public class LongestFibonacciSeq873 {
    public static void main(String[] args) {
        int[] arr = {1,3,7,11,12,14,18};
        System.out.println(longestFibonacciSubSequence(arr));
    }

    //Wrong understanding of problem = wrong solution
    public static int longestFibonacciSubSequence(int[] arr){
        HashSet<Integer> fibSet = new HashSet<>();
        int[] arrayFib = new int[1000];
        arrayFib[1] = 1;
        arrayFib[2] = 1;
        fibSet.add(1);
        int i = 3;
        while(arrayFib[i - 1] < arr[arr.length - 1]){
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
            fibSet.add(arrayFib[i]);
            i++;
        }
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if(fibSet.contains(arr[j])) count++;
        }
        return count;
    }
}
