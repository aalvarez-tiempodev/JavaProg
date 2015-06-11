/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity6;
import java.util.Random;

public class Location {  
    private double longitude;
    private double latitude;   
   
    public Location(double lat, double lon) {        
        this.latitude  = lat;
        this.longitude = lon;
    }
    
    
    public static Location doRandom(){
    	Random random = new Random();
    	return new Location((random.nextDouble() * 360.0) + 90.0,
                (random.nextDouble() * 360.0) + 90.0);    	
    }
    
    

    // return string representation of this point
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }


    // test client
    public static void main(String[] args) {       
    	Location loc1 = doRandom();    	   
    	System.out.println("Random location: " + loc1.toString());
    	
    	Location loc2 = new Location(12.345, 67.890);
    	System.out.println("Location: " + loc2.toString());
    	
    }
}