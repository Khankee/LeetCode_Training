package Learning;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for(String val : new Scanner(System.in).nextLine().split(";")){
            if(val.contains("-")){
                String[] temp = val.split("-");
                count += Integer.parseInt(temp[1]) - Integer.parseInt(temp[0]);
            }
            count++;
        }

        System.out.println(count);
    }
}
