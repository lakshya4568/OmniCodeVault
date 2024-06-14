import java.util.Arrays;
import java.util.Scanner;

public class dynamic {
    public static long fib(int n, long f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            // initally the f[n] is initialize from 0
            // fib(n) is already calculated, store it in f[n] and return
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static long fiboTabulation(int n) {
        long f[] = new long[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
    
    public static int countWays(int n, int ways[]) {
        // through memoization
        // base case
        if (n == 0) {
            // we have one way
            return 1;
        }
        if (n < 0) {
            // when n is negative -> -1, we have 0 ways
            return 0;
        }

        if (ways[n] != -1) {
            // we store the calculated value of the given ways
            return ways[n];
        }

        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the input value : ");
        int n = input.nextInt();
        //long f[] = new long[n + 1];

        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        
        System.out.println(countWays(n, ways));
        input.close();
    }
}
