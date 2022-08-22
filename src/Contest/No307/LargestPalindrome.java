package Contest.No307;

import java.util.HashMap;

public class LargestPalindrome {

    public static void main(String[] args) {
        System.out.println(largestPalindrome("9"));
    }

    public static String largestPalindrome(String num){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++){
            map.put(num.charAt(i) - '0', map.getOrDefault(num.charAt(i) - '0', 0) + 1);
        }

        StringBuilder answer = new StringBuilder("");

        for(int i = 9; i >= 0; i--){
            if(map.containsKey(i)){
                if(i == 0 && answer.length() == 0)break;
                int halfway = (answer.length() / 2);
                int count = map.get(i);
                int freq = 0;
                for(int j = 0; j < map.get(i) / 2; j++){
                    if(i == 0){
                        answer.insert(halfway, i);
                        answer.insert(halfway, i);
                    } else {
                        answer.insert(halfway, (i + (i * 10)));
                    }
                    freq += 1;
                }
                map.put(i, (freq * -2) + count);
            }
        }
        int halfway = (answer.length() / 2);
        if(answer.length() == 0 && map.containsKey(0)){
            map.put(0, 1);
        }

        for(int i = 9; i >= 0; i--){
            if(map.containsKey(i)){
                if(map.get(i) == 1){
                    answer.insert(halfway, i);
                    return String.valueOf(answer);
                }
            }
        }
        return String.valueOf(answer);
    }
}
