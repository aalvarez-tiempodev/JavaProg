/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity6;
import java.util.*;
import java.text.*;

public class Date2 {
   

 private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private final int month;   // month (between 1 and 12)
    private final int day;     // day   (between 1 and DAYS[month]
    private final int year;    // year
  private final Calendar cal;
    // do bounds-checking to ensure object represents a valid date
    public Date2(int m, int d, int y) {
        if (!isValid(m, d, y)) throw new RuntimeException("Invalid date");
        month = m;
        day   = d;
        year  = y;
        
        cal = new GregorianCalendar();
      cal.set(year,month,day);
    }

    // is the given date valid?
    private static boolean isValid(int m, int d, int y) {
        if (m < 1 || m > 12)      return false;
        if (d < 1 || d > DAYS[m]) return false;
        if (m == 2 && d == 29 && !isLeapYear(y)) return false;
        return true;
    }

    // is y a leap year?
    private static boolean isLeapYear(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return (y % 4 == 0);
    }

       // return a string representation of this date
    public Calendar date() {
        return cal;
    }
    
     // return the next Date
    public Date2 next() {
        if (isValid(month, day + 1, year))    return new Date2(month, day + 1, year);
        else if (isValid(month + 1, 1, year)) return new Date2(month + 1, 1, year);
        else                                  return new Date2(1, 1, year + 1);
    }


    // is this Date after b?
    public boolean isAfter(Date2 b) {
        return compareTo(b) > 0;
    }

    // is this Date a before b?
    public boolean isBefore(Date2 b) {
        return compareTo(b) < 0;
    }

    // comparison function between two dates
    public int compareTo(Date2 b) {
        if  (year  != b.year)  return year  - b.year;
        if  (month != b.month) return month - b.month;
        return day - b.day;
    }
     // return a string representation of this date
    public String toString() {
        return month + "/" + day + "/" + year;
    }
    
    // sample client for testing
    public static void main(String[] args) {
        
            Date2 date1 = new Date2(1, 1, 1970);
             Date2 date2 = new Date2(6, 1, 2015);
             
   
     System.out.println("Days= "+daysBetween(date1.date().getTime(),date2.date().getTime()) + " from " + date1.toString() + " to " + date2.toString() );
     
    }

    private static int daysBetween(Date d1, Date d2){
             return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
}