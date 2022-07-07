package EasyProblems;

public class LOngestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s){
        if (s.length() == 1) return 1;
        int[] alphabetArray = new int[52];
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) > 96){
                alphabetArray[s.charAt(i) - 'a']++;
            } else {
                alphabetArray[s.charAt(i) - 'A' + 26]++;
            }
        }
        int palindromeOdd = 1;
        int count = 0;
        for (int i = 0; i < alphabetArray.length; i++){
            if(alphabetArray[i] > 1){
                if(alphabetArray[i] % 2 == 0){
                    count += alphabetArray[i];
                }
                else {
                    count = count + alphabetArray[i] - 1;
                }
            }
            else if(alphabetArray[i] == 1 && palindromeOdd == 1){
                count++;
                palindromeOdd -= 1;
            }
        }

        return count;
    }
}
