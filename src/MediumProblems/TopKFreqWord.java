package MediumProblems;

import java.util.*;

public class TopKFreqWord {
    public static void main(String[] args) {
        String[] words = {"plpaboutit","jnoqzdute","sfvkdqf","mjc","nkpllqzjzp","foqqenbey","ssnanizsav","nkpllqzjzp","sfvkdqf","isnjmy","pnqsz","hhqpvvt","fvvdtpnzx","jkqonvenhx","cyxwlef","hhqpvvt","fvvdtpnzx","plpaboutit","sfvkdqf","mjc","fvvdtpnzx","bwumsj","foqqenbey","isnjmy","nkpllqzjzp","hhqpvvt","foqqenbey","fvvdtpnzx","bwumsj","hhqpvvt","fvvdtpnzx","jkqonvenhx","jnoqzdute","foqqenbey","jnoqzdute","foqqenbey","hhqpvvt","ssnanizsav","mjc","foqqenbey","bwumsj","ssnanizsav","fvvdtpnzx","nkpllqzjzp","jkqonvenhx","hhqpvvt","mjc","isnjmy","bwumsj","pnqsz","hhqpvvt","nkpllqzjzp","jnoqzdute","pnqsz","nkpllqzjzp","jnoqzdute","foqqenbey","nkpllqzjzp","hhqpvvt","fvvdtpnzx","plpaboutit","jnoqzdute","sfvkdqf","fvvdtpnzx","jkqonvenhx","jnoqzdute","nkpllqzjzp","jnoqzdute","fvvdtpnzx","jkqonvenhx","hhqpvvt","isnjmy","jkqonvenhx","ssnanizsav","jnoqzdute","jkqonvenhx","fvvdtpnzx","hhqpvvt","bwumsj","nkpllqzjzp","bwumsj","jkqonvenhx","jnoqzdute","pnqsz","foqqenbey","sfvkdqf","sfvkdqf"};
        System.out.println(topKFrequent(words, 2));

    }
    public static List<String> topKFrequent(String[] words, int k){
        List<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String[]> maxHeap = new PriorityQueue<>((x, y) ->{
            if(x[1].equals(y[1])){
                return x[0].compareTo(y[0]);
            } else {
                return  y[1].compareTo(x[1]);
            }
        });

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String[] temp = {entry.getKey(), String.valueOf(entry.getValue())};
            if(temp[1].length() > 1){
                temp[1] = "9" + temp[1].substring(1);
            }
            maxHeap.add(temp);
        }
        while(k > 0 && !maxHeap.isEmpty()){
            result.add(maxHeap.poll()[0]);
            k--;
        }
        return result;
    }

}
