package EasyProblems;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagarm"));
    }
    //a n a g r a m
    // a - 3
    // n - 1
    // g - 1
    // r - 1
    // m - 1

    //0(n)
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            if(map.containsKey(character)){
                int temp = map.get(character);
                map.replace(character, temp + 1);
            } else {
                map.put(character, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char character = t.charAt(i);
            if(map.containsKey(character)){
                if(map.get(character) == 1){
                    map.remove(character);
                } else {
                    int temp = map.get(character);
                    map.replace(character, temp - 1);
                }
            }
        }

        return map.isEmpty();
    }
}
