/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity3;

/**
 *
 * @author ARIEL
 */

import java.util.Scanner;
public class  IBMDigitVerification {
    
 public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
System.out.println("Enter a card number: ");  

        String M = scanner.next();
        
Boolean result = ValidCreditCard(M);

if(result)
{
    System.out.println("Valid number");    
}else
{
     System.out.println("Invalid number!!" );  
}

    }
 
 
 private static boolean ValidCreditCard(String number){
	        
	    	int s1 = 0, s2 = 0;
	        String reverse = new StringBuffer(number).reverse().toString();
	        for(int i = 0 ;i < reverse.length();i++){
	            int digit = Character.digit(reverse.charAt(i), 10);
	            if(i % 2 == 0){//this is for odd digits, they are 1-indexed in the algorithm
	                s1 += digit;
	            }else{//add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
	                s2 += 2 * digit;
	                if(digit >= 5){
	                    s2 -= 9;
	                }
	            }
	        }
	        return (s1 + s2) % 10 == 0;
	    }
}
