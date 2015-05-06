/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section1.pkg1;

public class Binary { 
    public static void main(String[] args) { 

        // read in the command-line argument
        int n = Integer.parseInt(args[0]);
for (int i = 1; i <= n; i++) {
    String line = "";

    for (int k = 2; k >= 0; k--) {
        line += ((i >> k) & 1) == 1 ? "1" : "0";
    }

    System.out.print(i + " BINARY: " +  line + " HEXA: ");
    hexa(i);
    System.out.println();
}
    }
    
    public static void hexa(int num) {
    int m = 0;
    if( (m = num >>> 4) != 0 ) {
        hexa( m );
    }
    System.out.print( (char)((m=num & 0x0F)+(m<10 ? 48 : 55)));
}

}