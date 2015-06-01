/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity5;

/*************************************************************************
 *  Compilation:  javac Bug1.java
 *  Execution:    java Bug1
 *
 *  Mistake with constructor since it shouldn't have return type void.
 *  One way to debug this is to insert a println statement in the
 *  constructor, and observe that it never gets executed.
 * 
 *  % java Bug1
 *  Exception in thread "main" java.lang.NullPointerException
 *        at Bug1.main(Bug1.java:24) 
 *
 *************************************************************************/

public class Bug1 {
   private String s;

   public void Return() {
       System.out.println("here");
      s = "hello";
   }

   public String toString() { return s.toUpperCase();  }

   public static void main(String[] args) {
      Bug1 x = new Bug1();
      x.Return();
      System.out.println(x.s);
   }
}   
