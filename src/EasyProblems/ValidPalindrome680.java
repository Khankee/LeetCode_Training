package EasyProblems;

public class ValidPalindrome680 {

    public static void main(String[] args) {
        System.out.println(validPalindrome("cbbcc"));
    }

    public static boolean validPalindrome(String s){

        int begin = 0;
        int end = s.length() - 1;
        boolean left = true;
        boolean right = true;

        while (begin < end){
            if(s.charAt(begin) == s.charAt(end)){
                begin++;
                end--;
                continue;
            }
            int saveBegin = begin;
            int saveEnd = end - 1;
            while (saveBegin < saveEnd){
                if(s.charAt(saveBegin) == s.charAt(saveEnd)){
                    saveBegin++;
                    saveEnd--;
                } else {
                    left = false;
                    break;
                }
            }
            saveBegin = begin + 1;
            saveEnd = end;
            while (saveBegin < saveEnd){
                if(s.charAt(saveBegin) == s.charAt(saveEnd)){
                    saveBegin++;
                    saveEnd--;
                } else {
                    right = false;
                    break;
                }
            }
            return left || right;
        }
        return true;
    }
}
