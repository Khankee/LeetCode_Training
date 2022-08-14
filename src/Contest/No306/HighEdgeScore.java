package Contest.No306;

import java.util.HashSet;

public class HighEdgeScore {

    public static void main(String[] args) {
        int[] edges = {1,0,7,0,0,7,5};
        System.out.println(edgeScore(edges));
    }

    public static int edgeScore(int[] edges){


        long[] bucket = new long[edges.length];

        for (int i = 0; i < edges.length; i++){
            bucket[edges[i]] += i;
        }
        long res = 0;
        int index = 0;
        for (int i = 0; i < bucket.length; i++){
            if(bucket[i] > res){
                res = bucket[i];
                index = i;
            }
        }

        return index;
    }
}
