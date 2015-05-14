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
import java.io.*;
public class PlayThatTuneDeluxe_1 implements Runnable{
    static BufferedReader in ;  static int quit=0;
     
    public void run(){
        String msg = null;
        while(true){
            try{
            msg=in.readLine();
            }catch(Exception e){}
             
            if(msg.equals("Q")) {quit=1;break;}
        }
    }
    
    // take weighted sum of two arrays
    public static double[] sum(double[] a, double[] b, double awt, double bwt) {

        // precondition: arrays have the same length
        assert (a.length == b.length);

        // compute the weighted sum
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i]*awt + b[i]*bwt;
        }
        return c;
    } 

    // create a pure tone of the given frequency for the given duration
    public static double[] tone(double hz, double duration) { 
        int N = (int) (StdAudio.SAMPLE_RATE * duration);
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++) {
            a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
        }
        return a; 
    } 

    // create a note with harmonics of of the given pitch, where 0 = concert A
    public static double[] note(int pitch, double t) {
         double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a  = tone(hz, t);
        double[] hi = tone(2*hz, t);
        double[] lo = tone(hz/2, t);
        double[] n14 = tone(hz/4, t);
        double[] n18 = tone(hz/8, t);
        double[] h  = sum(hi, lo, .5, .5);
        double[] n  = sum(n14, n18, .5, .5);
        double[] nt  = sum(h, n, .5, .5);
        return sum(a, nt, .5, .5);
    }


    // read in notes from standard input and play them on standard audio
    public static void main(String[] args) 
        throws Exception{
    in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("press Q THEN ENTER to terminate");
        
         // creating a new thread to handle the input
        Thread t1=new Thread(new PlayThatTuneDeluxe_1());
        t1.start();
int i = 0;
        while (args[i]!=null) {
        	try{
                    try{
            t1.sleep(10);       // main-thread is sleeping not the thread created above
            }catch(InterruptedException e){
            e.printStackTrace();
            }
                    
                    if(quit==1) break;
            double[] a = note(Integer.parseInt(args[i]), Double.parseDouble(args[i+1]));
            StdAudio.play(a);         
            i=i+2;
            }        	
        	catch(ArrayIndexOutOfBoundsException excepcion)
        	{System.exit(0);
        	}
        
        }
        
        System.exit(0);
    } 
} 