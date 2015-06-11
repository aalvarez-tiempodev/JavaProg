/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity6;
import java.util.*;
import java.text.*;

public class GeographicCoordinate {
   


    private int degrees;
    private int minutes;
    private int seconds; 
    
    public GeographicCoordinate(int d, int m, int s) {
        minutes = m;
        degrees   = d;
        seconds  = s;
        
    }

     // return a string representation of this date
    public String toString() {
        return "(" + degrees + "° " + minutes + "' " + seconds + "'')";
    }
    
    
    // sample client for testing
    public static void main(String[] args) {
        
            GeographicCoordinate date1 = new GeographicCoordinate(1, 1, 1970);
             GeographicCoordinate date2 = new GeographicCoordinate(6, 1, 2015);
             
      	System.out.println("Geographic coordinate 1: " + date1.toString());
           	System.out.println("Geographic coordinate 2: " + date2.toString());
     
    }

}