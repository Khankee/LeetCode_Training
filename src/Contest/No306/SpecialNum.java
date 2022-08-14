package Contest.No306;

import java.util.HashMap;

public class SpecialNum {
    public static void main(String[] args) {
        System.out.println(countSpecialNumbers(135));
    }

    public static int countSpecialNumbers(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            if(isSpecial(i)){
                res++;
            }
        }
        return res;
    }

    public static boolean isSpecial(int i){
        HashMap<Character, Integer> map = new HashMap<>();
        String temp = String.valueOf(i);
        for (int x = 0; x < temp.length(); x++){
            if(map.containsKey(temp.charAt(x))){
                map.put(temp.charAt(x), map.getOrDefault(temp.charAt(x),0) + 1);
            } else {
                map.put(temp.charAt(x) , 1);
            }
        }
        for(int val : map.values()){
            if(val >= 2){
                return false;
            }
        }

        return true;
    }
}
