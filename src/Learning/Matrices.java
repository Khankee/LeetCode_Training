package Learning;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {

        int[][] n = {{6,5,12},
                     {9,4,8},
                     {5,3,2}};


        int[][] m = {{3,7,1},
                     {2,10,-5},
                     {5,3,2}};

        System.out.println(Arrays.deepToString(Matrix(n,m)));
    }

    public static int[][] Matrix(int[][] n, int[][] m){
        int[][] result = new int[n.length][n.length];

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                result[i][j] = n[i][j] - m[i][j];
            }
        }
        return result;
    }
}
