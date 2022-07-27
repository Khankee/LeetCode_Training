package EasyProblems;

import java.util.HashMap;

public class firstUniqCharacter {
    public static void main(String[] args) {
        System.out.println(firsUniqChar("helloworldhewrd"));
    }

    public static int firsUniqChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        for (int i = 0; i < s.length(); i++){
            int uniq = map.get(s.charAt(i));
            if(uniq == 1){
                return i;
            }
        }

        return -1;
    }
}
