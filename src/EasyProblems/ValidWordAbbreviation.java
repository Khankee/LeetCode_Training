package EasyProblems;

public class ValidWordAbbreviation {
    public static void main(String[] args) {
        System.out.println(validWordAbbr("longestpalindrome", "lon4palin5"));
    }

    public static boolean validWordAbbr(String word, String abbr){

        int len = abbr.length();
        if(word.length() == 1){
            return word.charAt(0) == abbr.charAt(0) || abbr.charAt(0) == '1';
        }

        for (int i = 0; i < len; i++){
            if(word.charAt(i) == abbr.charAt(i)){
                continue;
            }
            if(abbr.charAt(i) == '0')return false;
            if(abbr.charAt(i) >= '1' && abbr.charAt(i) <= '9'){
                if(i + 1 < len){
                    if(abbr.charAt(i + 1) >= '1' && abbr.charAt(i + 1) <= '9'){
                        int end = Integer.parseInt(abbr.substring(i,i + 2));
                        if(end > word.length()) return false;
                        word = word.substring(0,i) + end + word.substring(end + i);
                        i++;
                        continue;
                    }
                }
                int end = Integer.parseInt(abbr.substring(i,i + 1));
                if(end > word.length()) return false;
                word = word.substring(0,i) + end + word.substring(end + i);
            }
        }
        return word.length() == abbr.length();
    }
}
