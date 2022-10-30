import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        int n = sc.nextInt();
        int sum = 0;
        int r = 0, g = 0, b = 0;

        for (int i = 0; i < n; i++) {
            String t = sc.next();
            if (t.equals("red"))
                r++;
            else if (t.equals("green"))
                g++;
            else
                b++;

            //norm
            double c = r;
            if (g < c && g != 0)
                c = g;
            if (b < c && b != 0)
                c = b;

            String p;
            if (c != 0) {
                p = "" + (r/c) + (g/c) + (b/c);
            } else {
                p =""+ (r) + (g) + (b);
            }

            //System.err.println(p);

            if (!set.contains(p)) {
                sum++;
                set.add(p);
            }
        }

        System.out.println(sum);
    }

}
