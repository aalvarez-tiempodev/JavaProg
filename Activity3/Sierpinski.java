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
//Program that draws the Sierpinski fractal.


public class Sierpinski {
public static final int SIZE = 512;  // height/width of DrawingPanel

 public static void main(String[] args) {
     // prompt for level
     float area=1;
	 int level = 1;
	 while (area >= 0.000000000000000000000001){     
     int n = level-1 ;    
     area =(float)Math.pow(0.75, n);
   
     level++;
	 }
  System.out.printf("%1.20f", area);
     StdOut.println(" level = " + level);
 }

}