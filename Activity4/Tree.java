/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity4;

/**
 *
 * @author adriana alvarez
 */

/*************************************************************************
 *  Compilation:  javac Tree.java
 *  Execution:    java Tree N
 *  Dependencies: StdDraw.java
 *  
 *  Plot a tree fractal.
 *
 *  % java Tree 9
 *
 *************************************************************************/


public class Tree {

    public static void tree(int n, double x, double y, double a, double branchRadius) {
        double bendAngle   = Math.toRadians(15);
        double branchAngle = Math.toRadians(37);
        double branchRatio = .65;

        double cx = x + Math.cos(a) * branchRadius;
        double cy = y + Math.sin(a) * branchRadius;
        StdDraw.setPenRadius(.001 * Math.pow(n, 1.2));
        StdDraw.line(x, y, cx, cy);
        if (n == 0) return;

        tree(n-1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio);
        tree(n-1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio);
        tree(n-1, cx, cy, a + bendAngle,               branchRadius * (1 - branchRatio));
  }

    public static void main(String[] args)  throws InterruptedException{
    
            for (int i = 1; i < 5; i++)
            {
        StdDraw.show(0);
        tree(i, .5, 0, Math.PI/2, .3);
        StdDraw.show(0);
        Thread.sleep(400);
            }
            
                 StdDraw.show(0);
        tree(8, .5, 0, Math.PI/2, .3);
        StdDraw.show(0);
    }
}

