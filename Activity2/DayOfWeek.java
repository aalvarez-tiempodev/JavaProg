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

    public class DayOfWeek {
    public static void main(String[] args) { 
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        String[] namesOfDays =  {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        System.out.println(d+"/" + m +"/" + y + " Day := "+namesOfDays[d0]);
    }

}
    

