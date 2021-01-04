/*
Class: TwoPointFive
Name: Whitney Boutin
Date: 1/30/2018

Desc: Reads in gratuity rate and subtotal, then calculates gratuity and total.
      Displays results. (Completes exercise 2.5)
 */
import java.util.Scanner;
public class TwoPointFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuity, total;
        int gratuityRate;
        
        //Prompts user for subtotal
        System.out.print("Enter subtotal(i.e. 10.25):");
        subtotal = input.nextDouble();
        
        //Prompts user for gratuity rate
        System.out.print("Enter gratuity rate(i.e. 15):");
        gratuityRate = input.nextInt();
        
        //calculates gratuity and total, displays results
        gratuity = subtotal * ((double)gratuityRate / 100);
        total = gratuity + subtotal;        
        System.out.printf("The gratuity is %.2f, "
                + "and the total price is %.2f\n", gratuity, total);
    }
}
