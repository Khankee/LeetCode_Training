package Contest.No305;

public class LongestIdealSubsequence {
    public static void main(String[] args) {
        String s = "eduktdb";
        System.out.println(longestIdealString(s,15));
    }
    public static int longestIdealString(String s, int k){
        int[] bucket = new int[25];
        for(int i = 0 ; i < s.length(); i++){
            bucket[s.charAt(i) - 'a']++;
        }
        int[] dp = new int[25];

        int streak = 0;
        if(bucket[0] != 0){
            dp[0] = 1;
            streak = 1;
        }
        int limit = 0;
        for(int i = 1; i < 25; i++){
            if(bucket[i] == 0){
                limit++;
            }
            if(limit == k - 1){
                streak = 0;
                limit = 0;
            }
            if(bucket[i] != 0){
                streak++;
            }
            dp[i] = Math.max(dp[i - 1], streak);
        }

        return dp[24];
    }
}
