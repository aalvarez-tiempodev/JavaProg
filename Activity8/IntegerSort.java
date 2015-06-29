/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity8;

import java.util.Arrays;

/*************************************************************************
 *  Compilation:  javac IntegerSort.java
 *  Execution:    java IntegerSort < input.txt
 *  
 *  Reads in sequence of integers between 0 and 99 and print them in
 *  sorted order.
 *
 *  % more input.txt
 *  98 2 3 1 0 0 0 3 98 98 2 2 2 0 0 0 2
 *
 *  % java IntegerSort < input.txt
 *  0 0 0 0 0 0 1 2 2 2 2 2 3 3 98 98 98 
 *
 *************************************************************************/

public class IntegerSort {

    public static void main(String[] args) {
    In in = new In(args[0]);
    
              String s = in.readAll();
              String[] words = s.split("\\s+");
                      Arrays.sort(words);

        int[] a = new int[words.length];
for (int i = 0; i < a.length; i++) {
    a[i] = Integer.parseInt(words[i]);
    
     StdOut.print(a[i] + " ");
}
//        int MAX = 100;               // integers are between 0 and MAX-1
//        int[] freq = new int[MAX];   // freq[i] = number of occurrences of i
//
//        // read in values and calculate frequencies
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 0 || a[i] >= MAX) throw new RuntimeException("Invalid integer");
//            freq[i]++;
//        }
//
//    
//        // print values in sorted order
//        for (int i = 0; i < MAX; i++) {
//            for (int j = 0; j < freq[i]; j++) {
//                StdOut.print(i + " ");
//            }
//        }
        StdOut.println();
    }

}
