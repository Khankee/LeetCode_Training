package Learning.BitManipulation;

public class BaseSeven {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num){
        if (num == 0) return "0";
        StringBuilder convert = new StringBuilder();
        int base = 7;
        boolean negative = false;

        if (num < 0) {
            num = -num;
            negative = true;
        }

        while (num > 0) {
            int d = num % base;
            num /= base;
            convert.append(d);
        }

        if (negative)
            convert.append('-');

        return new StringBuilder(convert.toString()).reverse().toString();
    }
}
