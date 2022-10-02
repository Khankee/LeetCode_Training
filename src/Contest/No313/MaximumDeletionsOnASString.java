package Contest.No313;

import java.util.HashMap;
import java.util.HashSet;

public class MaximumDeletionsOnASString {
    public static void main(String[] args) {
        System.out.println(deleteString("abcabcdabc"));
    }

    static int max = 0;
    static HashSet<String> memo = new HashSet<>();

    public static int deleteString(String s){
        if(s.length() == 1) return 1;

        for(int i = 1; i <= s.length() / 2 ; i++){
            if(s.substring(0, i).equals(s.substring(i,i+1))){
                if(memo.contains(s.substring(i))) continue;
                memo.add(s.substring(i));
                max = Math.max(max, dp(s.substring(i)) + 1);
            }
        }

        return dp(s);
    }

    public static int dp(String s){
        if(s.length() == 1) return 1;
        for(int i = 1; i <= s.length() / 2; i++){
            if(s.substring(0, i).equals(s.substring(i,i+1))){
                if(memo.contains(s.substring(i))) continue;
                memo.add(s.substring(i));
                max = Math.max(dp(s.substring(i)) + 1, max);
            }
        }
        return max;
    }
}
