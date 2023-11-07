package MediumProblems;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class EliminateMaximumNumberOfMonsters {

    public static void main(String[] args) {
        int[] dist = {3,2,4};
        int[] speed = {5,3,2};
        //System.out.println(3/5);

        System.out.println(eliminateMaximum(dist,speed));
    }

    public static int eliminateMaximum(int[] dist, int[] speed){
        for (int i = 0; i < dist.length; ++i)
            dist[i] = (dist[i] - 1) / speed[i];
        Arrays.sort(dist);
        for (int i = 0; i < dist.length; ++i)
            if (i > dist[i])
                return i;
        return dist.length;
    }
}
