/*
Class: TwoPointFourteen
Name: Whitney Boutin
Date: 1/30/2018

Desc: Takes in weight and height in inches and pounds and converts to BMI.
      Displays results. (Completes exercise 2.14)
 */
import java.util.Scanner;
public class TwoPointFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inches, pounds, kilograms, meters, bmi;
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        //prompts user for weight
        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();
        
        //prompts user for height
        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();
        
        //calculates BMI
        kilograms = pounds * KILOGRAMS_PER_POUND;
        meters = inches * METERS_PER_INCH;
        bmi = kilograms / Math.pow(meters, 2);
        
        //displays results
        System.out.printf("BMI is %.4f\n", bmi);
    }
}
