/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity4;

/**
 *
 * @author adriana alvarez
 */

public class GoldenRatio {
   public static double golden(int n) {
       if (n == 0) return 1;
       return 1.0 + 1.0 / golden(n-1);
   }

   public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);
      System.out.println(golden(N));
   }

}
