package Contest.No314;

public class SumToDivK {

    static int count = 0;

    public static int numberOfPaths(int[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;

        if(grid.length == 1 || grid[0].length == 1){
            int sum = 0;
            for (int[] row : grid){
                for (int val : row){
                    sum += val;
                }
            }
            return sum % k == 0 ? 1 : 0;
        }

        int rowSum = grid[0][0];
        int colSum = grid[0][0];

        for(int i = 1; i < grid[0].length; i++){
            rowSum += grid[0][i];
            colSum += grid[grid.length - 1][i];
            grid[0][i] = rowSum;
        }
        for(int i = 1; i < grid.length; i++){
            colSum += grid[i][0];
            rowSum += grid[i][grid.length - 1];
            grid[i][0] = colSum;
        }

        if(rowSum % k == 0)count += 1;
        if(colSum % k == 0)count += 1;

        if(m > 2 || n > 2){
            int headUP = grid[0][1];
            int headRight = grid[1][0];
            int[][] tempGrid;
            if(m > 2 && n > 2){tempGrid = new int[m - 1][n - 1];}
        }
        return count;
    }
}
