package EasyProblems;

public class FibonacciNumber509 {
    public static void main(String[] args) {
        System.out.println(Fib(10));
    }
    public static int Fib(int N){
        int[] arrayFib = new int[N + 1];
        arrayFib[1] = 1;
        arrayFib[2] = 1;
        if (N <= 2){
            return arrayFib[1];
        }
        for (int i = 3; i <= N; i++){
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
        }
        return arrayFib[N];
    }
}
