package Contest.YandexCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Delenie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Scanner scan = new Scanner(System.in);
        while(t > 0){
            t -= 1;
            long n = scan.nextLong();
            int del =  scan.nextInt();
            if(del == 1){
                System.out.println(n);
                continue;
            }
            long count = 0;
            if(del == 2){
                for(int i = del; i <= n; i += del){
                    String s = i +"";
                    if(s.contains("1"))continue;
                    count += 1;
                }
            } else if(del == 3){
                for(int i = del; i <= n; i += del){
                    String s = i +"";
                    if(s.contains("1") || s.contains("2"))continue;
                    count += 1;
                }
            } else if(del == 4) {
                for (int i = del; i <= n; i += del) {
                    String s = i + "";
                    if (s.contains("1") || s.contains("2") || s.contains("3")) continue;
                    count += 1;
                }
            } else if(del == 5) {
                for (int i = del; i <= n; i += del) {
                    String s = i + "";
                    if (s.contains("1") || s.contains("2") || s.contains("3")) continue;
                    if (s.contains("4")) continue;
                    count += 1;
                }
            } else if(del == 6) {
                for (int i = del; i <= n; i += del) {
                    String s = i + "";
                    if (s.contains("1") || s.contains("2") || s.contains("3")) continue;
                    if (s.contains("4") || s.contains("5")) continue;
                    count += 1;
                }
            } else if(del == 7) {
                for (int i = del; i <= n; i += del) {
                    String s = i + "";
                    if (s.contains("1") || s.contains("2") || s.contains("3")) continue;
                    if (s.contains("4") || s.contains("5") || s.contains("6")) continue;
                    count += 1;
                }
            } else if(del == 8) {
                for (int i = del; i <= n; i += del) {
                    String s = i + "";
                    if (s.contains("1") || s.contains("2") || s.contains("3") || s.contains("7")) continue;
                    if (s.contains("4") || s.contains("5") || s.contains("6")) continue;
                    count += 1;
                }
            } else if(del == 9) {
                for (int i = del; i <= n; i += del) {
                    String s = i + "";
                    if (s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4")) continue;
                    if (s.contains("7") || s.contains("8") || s.contains("5") || s.contains("6")) continue;
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
