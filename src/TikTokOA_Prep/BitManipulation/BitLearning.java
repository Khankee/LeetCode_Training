package TikTokOA_Prep.BitManipulation;

public class BitLearning {
    public static void main(String[] args) {
        int a = 23;
        int b = 16;
        int c = 19;

        int print1 = ( a | b ) & c;
        int print2 = (a & c) | (b & c);
        System.out.println(print1 + " and " + print2);

    }
}
