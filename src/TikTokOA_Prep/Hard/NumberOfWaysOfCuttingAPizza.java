package TikTokOA_Prep.Hard;

public class NumberOfWaysOfCuttingAPizza {
    public static void main(String[] args) {
        int[][] forest = {{1,2,3},{2,1,2},{3,1,1}};
        String[] pizza = {".A.","A.A","..."};
        System.out.println(ways(forest, 3));
    }
    public static int ways(int[][] forest, int k){
        int m = forest.length;
        int n = forest[0].length;
        Integer[][][] dp = new Integer[k][m][n];
        int[][] prSum = new int[m + 1][n + 1];
        for(int row = m - 1; row >= 0; row--){
            for(int col = n - 1; col >= 0; col--){
                prSum[row][col] = prSum[row][col+1] + prSum[row + 1][col] - prSum[row+1][col + 1] + (forest[row][col] == 2 ? 1 : 0);
            }
        }
        return dfs(m, n, k - 1,0,0,dp,prSum);
    }

    public static int dfs(int m, int n, int k, int r,int c, Integer[][][] dp, int[][] preSum){
        if(preSum[r][c] == 0) return 0;
        if(k == 0) return 1;
        if(dp[k][r][c] != null) return dp[k][r][c];
        int ans = 0;
        for(int nr = r + 1;  nr < m; nr++){
            if(preSum[r][c] - preSum[nr][c] > 0){
                ans = (ans + dfs(m, n, k - 1, nr, c, dp, preSum)) % 1_000_000_007;
            }
        }
        for(int nc = c + 1; nc < n; nc++){
            if(preSum[r][c] - preSum[r][nc] > 0){
                ans = (ans + dfs(m,n, k - 1, r, nc, dp, preSum)) % 1_000_000_007;
            }
        }
        return dp[k][r][c] = ans;
    }
}
