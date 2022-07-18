package MediumProblems;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence1("abc", "deb"));
    }

    public static int longestCommonSubsequence1(String text1, String text2){
        int[][] gridDP = new int[text1.length() + 1][text2.length() + 1];

        for (int col = text2.length() - 1; col>= 0; col--){
            for (int row = text1.length() - 1; row>=0; row--){
                if(text1.charAt(row) == text2.charAt(col)){
                    gridDP[row][col] = 1 + gridDP[row + 1][col + 1];
                } else {
                    gridDP[row][col] = Math.max(gridDP[row + 1][col], gridDP[row][col + 1]);
                }
            }
        }

        return gridDP[0][0];
    }

    public static int longestCommonSubsequence2(String text1, String text2){
        // If text1 doesn't reference the shortest string, swap them.
        if (text2.length() < text1.length()) {
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }

        // The previous column starts with all 0's and like before is 1
        // more than the length of the first word.
        int[] previous = new int[text1.length() + 1];

        // Iterate through each column, starting from the last one.
        for (int col = text2.length() - 1; col >= 0; col--) {
            // Create a new array to represent the current column.
            int[] current = new int[text1.length() + 1];
            for (int row = text1.length() - 1; row >= 0; row--) {
                if (text1.charAt(row) == text2.charAt(col)) {
                    current[row] = 1 + previous[row + 1];
                } else {
                    current[row] = Math.max(previous[row], current[row + 1]);
                }
            }
            // The current column becomes the previous one.
            previous = current;
        }

        // The original problem's answer is in previous[0]. Return it.
        return previous[0];
    }


}
