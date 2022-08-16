package EasyProblems;

import java.util.HashMap;

public class firstUniqCharacter {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        System.out.println(firstUniqChar("helloworldhewrd"));
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);

        long time3 = System.nanoTime();
        System.out.println(firsUniqChar("helloworldhewrd"));
        long time4 = System.nanoTime();
        System.out.println(time4 - time3);
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

    public static int firstUniqChar(String s){
        int[] bucket = new int[26];
        for(int i = 0; i < s.length(); i++){
            bucket[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < s.length(); i++){
            if(bucket[s.charAt(i) - 'a'] == 1){
                return 1;
            }
        }
        return -1;
    }
}
