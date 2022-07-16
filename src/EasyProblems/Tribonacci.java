package EasyProblems;

public class Tribonacci {
    public static void main(String[] args) {

    }

    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        for(int i = 3; i <= n; i++){
            fib[i] = fib[i - 3] + fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
