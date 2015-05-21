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
/*************************************************************************
 *  Compilation:  javac Fibonacci.java
 *  Execution:    java Fibonacci N
 *
 *  Computes and prints the first N Fibonacci numbers.
 *
 *  WARNING:  this program is spectacularly inefficient and is meant
 *            to illustrate a performance bug, e.g., set N = 45.
 *
 *
 *   % java Fibonacci 7
 *   1: 1
 *   2: 1
 *   3: 2
 *   4: 3
 *   5: 5
 *   6: 8
 *   7: 13
 *
 *   Remarks
 *   -------
 *    - The 93rd Fibonacci number would overflow a long, but this
 *      will take so long to compute with this function that we
 *      don't bother to check for overflow.
 *
 *************************************************************************/

public class Tribonacci {
    public static long fib(int n) {
        	 if (n <= 1) return 0;
    	if (n <= 2) return 1;
        else return fib(n-1) + fib(n-2) + fib(n-3);
    }

    public static void main(String[] args) {
        
    	long startTime = System.currentTimeMillis();
        int i=1;
while ((System.currentTimeMillis()-startTime)< 1*60*1000){
  // do stuff      
    System.out.println(i + ": " + fib(i));
    i++;
}
	
    }

}
