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

/*************************************************************************
  *  Compilation:  javac DiamondTile.java
  *  Execution:    java DiamondTile N
  *  Dependencies: StdDraw.java
  *
  *  Create an N-by-N diamond tile.
  *************************************************************************/

public class DiamondTile {

   // draw a diamond outline, center at (x, y), diagonals = 2*size 
   public static void diamond(double x, double y, double size) {
      double[] px = { x + size, x,        x - size, x        };
      double[] py = { y,        y + size, y       , y - size };
      StdDraw.square(y, x, size);
   }

   // draw a filled diamond, center at (x, y), diagonals = 2*size
   public static void filledDiamond(double x, double y, double size) {
      double[] px = { x + size, x,        x - size, x        };
      double[] py = { y,        y + size, y       , y - size };
//      StdDraw.filledPolygon(px, py);
      StdDraw.filledSquare(x,y,size);
   }

   

   public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);

      // for easy computation, set scale to match pattern
      StdDraw.setXscale(0, N);
      StdDraw.setYscale(0, N);
int s = 0;
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < N; j++) {

            // black diamond
             if(s==0){
        		s = 1;
            StdDraw.setPenRadius();
            StdDraw.setPenColor(StdDraw.BLACK);
            filledDiamond(i+.5, j+.5, .5);
}else{
    		s = 0;
		 	}
        	 
            // red outline
            StdDraw.setPenRadius(.005);
//            StdDraw.setPenColor(StdDraw.RED);
            diamond(i+.5, j+.5, .5);
         }
         if (s==0)s++;
         else s--;
         
      }
   }                
}
