/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity8;

/*************************************************************************
 *  Compilation:  javac Dedup.java
 *  Execution:    java Dedup < input.txt
 *
 *  Reads a sequence of strings from standard input and print them
 *  to standard output with all duplicates removed (in sorted order).
 *
 *  %  java Dedup < itwas.txt 
 *  best
 *  it
 *  of
 *  the
 *  times
 *  was
 *
 *************************************************************************/

import java.util.Arrays;

public class Dedup {


    public static void main(String[] args) {
        In in = new In(args[0]);
        String s = in.readAll();
        String[] words = s.split("\\s+");

        Arrays.sort(words);

        String prev = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i-1]))
                StdOut.println(words[i]);
        }
    }
}
