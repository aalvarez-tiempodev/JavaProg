/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section1.pkg1;

/**
 *
 * @author ARIEL
 */
public class Factors {

    public static void main(String[] args) { 

        // command-line argument
        long n = Long.parseLong(args[0]);
       long start = System.nanoTime();
factors(n); 
long time = System.nanoTime() - start;

System.out.println("time: " + time+ " ns" );
    }
    
    private static void factors(long value)
    {
        
        System.out.print("The prime factorization of " + value + " is: ");

        // for each potential factor i
        for (long i = 2; i*i <= value; i++) {

            // if i is a factor of N, repeatedly divide it out
            while (value % i == 0) {
                System.out.print(i + " "); 
                value = value / i;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (value > 1) System.out.println(value);
        else       System.out.println();
    }
    }


