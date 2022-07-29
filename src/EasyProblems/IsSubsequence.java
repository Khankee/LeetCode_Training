package EasyProblems;

public class IsSubsequence {
    public static void main(String[] args) {

    }

    public static boolean isSubsequence(String s, String t){
        if(s.length() > t.length()) return false;
        int pointer = 0;

        for(int i = 0; i < t.length(); i++){
            if(pointer == s.length())break;
            if(t.charAt(i) == s.charAt(pointer)){
                pointer++;
            }
        }

        return pointer == s.length();
    }
}
