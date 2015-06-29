/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity9;


/*************************************************************************
 *  Compilation:  javac Directory.java
 *  Execution:    java Directory directory-name
 *  Dependencies: Queue.java
 *  
 *  Prints out all of the files in the given directory and any
 *  subdirectories in level-order by using a queue. Also prints
 *  out their file sizes in bytes.
 *
 *  % java Directory .
 *
 *************************************************************************/

import java.io.File;

public class Directory { 

    public static void main(String[] args) {
        Queue<File> q = new Queue<File>();
        File root = new File(args[0]);     // root directory
        q.enqueue(root);
        while (!q.isEmpty()) {
            File directory = q.dequeue();
            File[] files = directory.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) q.enqueue(files[i]);
                else System.out.println(files[i].length() + ":\t" + files[i]);
            }
        }
    }

}
