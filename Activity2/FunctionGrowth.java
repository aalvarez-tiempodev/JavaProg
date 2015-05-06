/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section1.pkg1;
import java.math.BigInteger;
        
        
/**
 *
 * @author ARIEL
 */
public class FunctionGrowth {
    public static void main(String[] args) { 
      System.out.println("log N \tN \tN log N\tN^2 \tN^3");
      BigInteger n = new BigInteger("1073741824");
      

     for (BigInteger bi = BigInteger.valueOf(2);
                bi.compareTo(n) <= 0;
                bi = bi.multiply(new BigInteger("2"))) {
         System.out.print((int) Math.log(bi.doubleValue()));
         System.out.print('\t');             // tab character
         System.out.print(bi);
         System.out.print('\t');             
         System.out.print((int) (bi.doubleValue() * Math.log(bi.doubleValue())));
         System.out.print('\t');             
         System.out.print(bi.multiply(bi));
         System.out.print('\t');             
         System.out.print(bi.multiply(bi.multiply(bi)));
         System.out.println();
      }
   }
}
