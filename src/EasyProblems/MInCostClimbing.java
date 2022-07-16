package EasyProblems;

public class MInCostClimbing {
    public static void main(String[] args) {

    }

    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 2)return Math.min(cost[0], cost[1]);//[1,1,4,6,0]

        int n = cost.length;//3

        int[] dp = new int[n + 2];//dp[0,0,0] cost[10,15,20]

        for(int i = n - 1; i >= 0; i--){
            dp[i] = cost[i] + Math.min(dp[i + 2],dp[i + 1]); //[0,0,22,4,0]
        }
        return Math.min(dp[0], dp[1]);
    }
}
