/*
Class: FourPointTwelve
Name: Whitney Boutin
Date: 2/2/2018

Desc: Reads in a hex digit and displays the binary value of it.
      (Completes exercise 4.12)
 */
import java.util.Scanner;

public class FourPointTwelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char hex;
        String binary = "";
        
        //prompts user for hex digit
        System.out.print("Enter a hex digit: ");
        hex = input.nextLine().charAt(0);
        
        //finds the values of hex
        switch(hex){
            case '0': binary = "0"; break;
            case '1': binary = "1"; break;
            case '2': binary = "10"; break;
            case '3': binary = "11"; break;
            case '4': binary = "100"; break;
            case '5': binary = "101"; break;
            case '6': binary = "110"; break;
            case '7': binary = "111"; break;
            case '8': binary = "1000"; break;
            case '9': binary = "1001"; break;
            case 'A': binary = "1010"; break;
            case 'B': binary = "1011"; break;
            case 'C': binary = "1100"; break;
            case 'D': binary = "1101"; break;
            case 'E': binary = "1110"; break;
            case 'F': binary = "1111"; break;
            default: System.out.println(hex + " is an invalid input"); return;
        }
        System.out.println("The binary value is " + binary);
    }
}
