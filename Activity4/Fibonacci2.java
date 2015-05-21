/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity4;

/**
 *
 * @author ARIEL
 */
public class Fibonacci2 {

    public static long fib(int n) {
        // base case
        if (n == 0) return 0;
        if ((n == 1)||(n == 2)) return 1;


        // n is odd
        if (n % 2 != 0) {
            long a = fib((n+1)/2);
            long b = fib((n-1)/2);
            return a*a + b*b;
        }

        // n is even
        long a = fib(n/2 + 1);
        long b = fib(n/2 - 1);
        return a*a - b*b;
    }

    public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++)
            System.out.println(i + ": " + fib(i));

        long sum = 0;
        for (int i = 0; i <= N; i++)
            sum += fib(i);
        System.out.println(sum);
    }

}

