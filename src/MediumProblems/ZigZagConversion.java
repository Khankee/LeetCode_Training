package MediumProblems;

import java.util.Arrays;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }

    public static String convert(String s, int numRows){
        if(numRows == 1) return s;

        char[][] zigzagList = new char[numRows][s.length() / 2 + numRows];
        for (char[] i : zigzagList){
            Arrays.fill(i, '0');
        }

        int counter = 0;
        int row = 0;
        for (int i = 0; i < s.length(); i++){
            if(counter < numRows){
                zigzagList[counter][row] = s.charAt(i);
            } else {
                if(counter == numRows * 2 - 1){
                    counter = 1;
                    zigzagList[counter][row] = s.charAt(i);
                } else {
                    row++;
                    zigzagList[(numRows * 2 - 2)- counter][row] = s.charAt(i);
                }
            }
            counter++;
        }
        printGrid(zigzagList);
        StringBuilder res = new StringBuilder();
        for(char[] str : zigzagList){
            res.append(String.valueOf(str));
        }
        String d = res.toString();
        d = d.replace("0","" );

        return d;
    }

    public static void printGrid(char[][] arr) {
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar + "");
            }
            System.out.println();
        }
    }
}
