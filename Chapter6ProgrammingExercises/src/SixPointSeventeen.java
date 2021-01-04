/*
Class: SixPointSeventeen
Name: Whitney Boutin
Date: 2/27/2018

Desc: Reads in n, and displays a matrix of random 1s and 0s
      (Completes exercise 6.17)
 */
import java.util.Scanner;

public class SixPointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompts user for n
        System.out.print("Enter n:");
        int n = input.nextInt();
        
        //calls printmatrix
        printMatrix(n);
       
    }
    /** function printMatrix */
    public static void printMatrix(int n) {
        double rand;
        
        //column loop
        for (int i = 1; i <= n; i++ ){
            
            //row loop
            for (int j = 1; j <= n; j++) {
                rand = 1 + Math.random() * 1000;

                if (rand >= 500) {
                    System.out.print("0  ");
                }
                else {
                    System.out.print("1  ");
                }
            }
            System.out.print("\n");
        }
    }
}
