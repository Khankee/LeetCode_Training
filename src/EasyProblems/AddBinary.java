package EasyProblems;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }

    public static String addBinary(String a, String b){
        long firstNum = Integer.parseInt(a, 2);
        long secondNum = Integer.parseInt(b, 2);

        long sum = firstNum + secondNum;

        return Long.toBinaryString(sum);
    }

    /*public static String addBinaryImproved(String a, String b){

    }*/
}
