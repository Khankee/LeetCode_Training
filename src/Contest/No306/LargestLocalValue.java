package Contest.No306;

public class LargestLocalValue {

    public static void main(String[] args) {

    }

    public static int[][] largestLocal(int[][] grid){
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];

        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res.length; j++){
                int max = 0;
                for(int x = i; x < i + 3; x++){
                    for(int y = j; y < j + 3; y++){
                        max = Math.max(grid[x][y], max);
                    }
                }
                res[i][j] = max;
            }
        }

        return res;
    }
}
