package MediumProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumDeletions {
    public static void main(String[] args) {
        System.out.println(minDeletions("aaabbbcc"));


    }

    //O(n)
    public static int Deletions(String s){
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++){
            if(map.containsKey(s.charAt(i))){
                int num = map.get(s.charAt(i));
                map.put(s.charAt(i), num + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        int[] uniq = new int[len];
        ArrayList<Integer> notUniq = new ArrayList<>();

        map.forEach((k, v) -> uniq[v] = v);
        for (int i = 0; i < map.size(); i++){
            // How to find not unique values ???????????
        }

        System.out.println(Arrays.toString(uniq));
        System.out.println(notUniq);

        int count = 0;

        for (int i = 0; i < notUniq.size(); i++){
            int check = notUniq.get(i);
            for (int j = check; j > 0; j--){
                if(j == uniq[j]){
                    count++;
                }
            }
        }

        return count;
    }

    //Solution
    public static int minDeletions(String s){
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        int deleteCount = 0;

        HashSet<Integer> seenFrequencies = new HashSet<>();
        for(int i = 0; i < 26; i++){
            while(frequency[i] > 0 && seenFrequencies.contains(frequency[i])){
                frequency[i]--;
                deleteCount++;
            }
            seenFrequencies.add(frequency[i]);
        }
        return deleteCount;

    }
}
