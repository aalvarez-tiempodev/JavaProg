/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity9;


/*************************************************************************
 *  Compilation:  javac Reverse.java
 *  Execution:    java Reverse < data.txt
 *  Dependencies: Stack.java
 *
 *  Reads in a sequence of strings from standard input and
 *  and prints them in reverse order to standard output.
 *
 *  %  java Reverse
 *  it was the best of times
 *  <ctrl-d>
 *  times
 *  of
 *  best
 *  the
 *  was
 *  it
 *
 *************************************************************************/

public class Reverse {

    public static void main(String[] args) {
          
          String[] item = args;
        Stack<String> stack = new Stack<String>();
         for (int i = 0; i < item.length; i++)
        {  
            stack.push(item[i]);
        }
        while (!stack.isEmpty()) {
            String s = stack.pop();
            StdOut.println(s);
        }
    }

}

