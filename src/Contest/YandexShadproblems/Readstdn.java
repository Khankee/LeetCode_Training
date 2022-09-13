package Contest.YandexShadproblems;

import java.io.*;
import java.util.HashMap;

public class Readstdn
{

    // 0 = innocent
    // 1 = sus
    // 2 = plagiarism
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String inputA = br.readLine();
        String inputB = br.readLine();
        int[] pos = new int[inputA.length()];

        for(int i = 0 ; i < inputA.length(); i++){
            if(inputA.charAt(i) == inputB.charAt(i)){
                pos[i] = 2;
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < inputA.length(); i++){
            if(pos[i] != 2){
                char character = inputA.charAt(i);
                int count = map.getOrDefault(character, 0);
                map.put(character, count + 1);
            }
        }

        for(int j = 0; j < inputB.length(); j++){
            if(pos[j] != 2){
                if(map.containsKey(inputB.charAt(j))){
                    char character = inputB.charAt(j);
                    int count = map.get(character);
                    if(count == 1) map.remove(character);
                    else map.put(character, count - 1);
                    pos[j] = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int val : pos){
            if(val == 2){
                sb.append("P");
            } else if(val == 1){
                sb.append("S");
            } else {
                sb.append("I");
            }
        }

        System.out.println(sb);
    }
}
