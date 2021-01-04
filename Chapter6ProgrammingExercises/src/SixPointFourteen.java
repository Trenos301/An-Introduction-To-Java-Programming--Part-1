/*
Class: SixPointFourteen
Name: Whitney Boutin
Date: 2/27/2018

Desc: Displays a table of increasingly accurate estimations of pi
      (Completes exercise 6.14)
 */
public class SixPointFourteen {
    public static void main(String[] args) {
        
        //calls the start and end values
        int start = 1, end = 901;
        
        //prints header
        System.out.println("\ni\t\tm(i)");
        System.out.println("---------------------");
        
        //calculates from start value to end value
        for (double i = start; i <= end; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("\t%.4f\n", m(i));
        }
        
    }
    
    
    /** Calculates pie */
    public static double m(double n) {
        double pi = 0;
        
        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi = pi * 4;
        
        return pi;
    }
}
