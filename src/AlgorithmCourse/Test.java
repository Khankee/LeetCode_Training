package AlgorithmCourse;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int n = 889;
        int count = 20;

        long time1 = System.nanoTime();
        System.out.println(Arrays.toString(getShiny(n,count)));
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);

        long time3 = System.nanoTime();
        System.out.println(Arrays.toString(getShiny2(n,count)));
        long time4 = System.nanoTime();
        System.out.println(time4 - time3);


    }

    public static int[] getShiny(int n, int count){

        int[] res = new int[count]; // Result

        for (int j = 0; j < count; j++){
            n += 1;
            String number = String.valueOf(n);
            StringBuilder temp = new StringBuilder();
            int highestDigit = 0;
            int allNineCounter = 0;
            for (int i = 0; i < number.length(); i++){
                if(number.charAt(i) == '9') allNineCounter +=1;
                if(number.charAt(i) - '0' > highestDigit){
                    highestDigit = number.charAt(i) - '0';
                }
                temp.append(highestDigit);
            }
            res[j] = Integer.parseInt(temp.toString());
            if(allNineCounter == temp.length()){
                temp = new StringBuilder(temp.toString().replace("9", "1"));
                temp.append("1");
            }
            number = temp.toString();
            n = Integer.parseInt(number);
        }

        return res;
    }

    // 6789
    // 6799
    // 6888
    // 6889
    // 6899
    // 6999
    // 7777


    public static int[] getShiny2(int n, int count){
        int[] res = new int[count];
        while (count > 0){
            n+= 1;
            String number = String.valueOf(n);
            int len = number.length();

            int[] digits = new int[len];
            for (int i = 0; i <= len - 1; i++){
                digits[i] = number.charAt(i) - '0';
            }
            boolean checked = true;

            for (int i = 0; i < len - 1; i++){
                if(digits[i] > digits[i + 1]){
                    checked = false;
                    break;
                }
            }
            if(checked){
                res[count - 1] = n;
                count--;
            }
        }
        return res;
    }


}
