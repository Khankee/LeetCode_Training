package Contest.No314;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    public static void main(String[] args) {
        int[][] logs = {{0,10},{1,20}};
        System.out.println(hardWorker(1,logs));

    }

    public static int hardWorker(int n, int[][] logs){
        if(logs.length == 1)return logs[0][0];
        int time = logs[0][1];
        int temp;


        for(int i = 1; i < logs.length; i++){
            temp = logs[i][1];
            logs[i][1] = logs[i][1] - time;
            time = temp;
        }

        Arrays.sort(logs, Comparator.comparingInt(o -> o[1]));


        int id = logs[logs.length - 1][0];
        int eq = logs[logs.length - 1][1];

        for(int i = logs.length - 1; i >= 0; i-- ){
            if(eq != logs[i][1]){
                return id;
            } else {
                id = Math.min(id , logs[i][0]);
            }
        }

        return id;
    }
}
