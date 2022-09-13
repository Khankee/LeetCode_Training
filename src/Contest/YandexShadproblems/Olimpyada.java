package Contest.YandexShadproblems;

import java.io.*;
import java.util.*;

public class Olimpyada {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int firstNum = Integer.parseInt(reader.readLine());
        String[][] competitions = new String[firstNum][2];
        for(int i = 0; i < firstNum; i++){
            competitions[i] = reader.readLine().split(",");
        }
        int secondNum = Integer.parseInt(reader.readLine());
        String[][] players = new String[secondNum][4];
        for(int i = 0; i < secondNum; i++){
            players[i] = reader.readLine().split(",");
        }
        reader.close();

        List<String> res = new ArrayList<>();

        HashMap<String, List<List<String>>> map = new HashMap<>();

        for (String[] player : players) {
            List<String> candidate = new ArrayList<>();
            candidate.add(player[0]);
            candidate.add(player[2]);
            candidate.add(player[3]);
            if (map.containsKey(player[1])) {
                map.get(player[1]).add(candidate);
            } else {
                map.put(player[1], new ArrayList<>());
                map.get(player[1]).add(candidate);
            }
        }

        for(String[] competition : competitions){
            int total = Integer.parseInt(competition[1]);
            List<List<String>> battle = map.get(competition[0]);
            battle.sort((o1, o2) -> {
                if (Integer.valueOf(o1.get(1)).equals(Integer.valueOf(o2.get(1))))
                    return Integer.valueOf(o1.get(2)).compareTo(Integer.valueOf(o2.get(2)));
                else
                    return Integer.valueOf(o2.get(1)).compareTo(Integer.valueOf(o1.get(1)));
            });
            for(int i = 0; i < total; i++){
                res.add(battle.get(i).get(0));
            }
        }
        Collections.sort(res);

        File fout = new File("output.txt");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for(String s : res){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
