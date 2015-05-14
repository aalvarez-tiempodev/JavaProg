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
public class SawTooth {
    
 public static void main(String[] args) {
        int N,wave=0;
        StdDraw.setCanvasSize(1400, 500);
        StdDraw.setXscale(0, 6 * Math.PI);
        StdDraw.setYscale(-2, 2);

        StdDraw.show(0);
        double xprev = 0.0;
        boolean lock = false;
        
for (int i = 1; i <= 1000; i+=10)
{
    N = i;
  
    
        for (double t = 0.0; t <= 6*Math.PI; t+= 0.005) {
            double x = 0.0;
            
             if(lock&&t >= 6*Math.PI) break ;
            for (int k = 1; k <= N; k++) {
                x += Math.sin(k*t) / k;
            }
            x = x * 2 / Math.PI;
            
            if(lock&&t >= 6*Math.PI) break ;
            
            StdDraw.line(t - 0.005, xprev, t, x);
                                             
            if(xprev>1&& x>1 && N >600)
            {
                lock = true;
                StdDraw.setPenColor(StdDraw.RED);
                if(wave==0)
                {
                    wave =N;
                }
            }
            
            xprev = x;
        }
        StdDraw.show(0);
}
        

        System.out.println("At level '" + wave + "' the wave starts to saw tooth");
        
//        System.exit(0);
    }
 
}