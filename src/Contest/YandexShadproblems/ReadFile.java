package Contest.YandexShadproblems;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String file = reader.readLine();
        String[] nums = file.split(" ");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }
        FileWriter writer = new FileWriter("output.txt");
        writer.write(String.valueOf(sum));
        writer.flush();
    }
}
