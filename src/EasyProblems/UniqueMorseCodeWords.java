package EasyProblems;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCodeWords {
    HashMap<Integer, String> map = new HashMap<>();

    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int i = 0;
        for(String c : code){
            map.put(i, c);
            i += 1;
        }

        HashSet<String> uniq = new HashSet<String>();

        for(int j = 0; j < words.length; j++){
            String word = "";
            for(int k = 0; k < words[j].length(); k++){
                word += map.get(words[j].charAt(k) - 'a');
            }
            uniq.add(word);
        }

        return uniq.size();
    }
}
