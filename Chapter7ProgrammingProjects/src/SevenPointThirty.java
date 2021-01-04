/*
Class: SevenPointThirty
Name: Whitney Boutin
Date: 3/12/2018

Desc: Reads in an array of integers, and checks whether or not there are four consecutive integers.
      Displays results. (Completes exercise 7.30)
 */
import java.util.Scanner;

public class SevenPointThirty {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        
        //prompts user to enter the number of values to be entered
        System.out.print("Enter the number of values: ");
        int nOfValues = input.nextInt();
        int[] values = new int[nOfValues];
        
        //prompts user to enter said values
        System.out.print("Enter the values: ");
        values = fillIntArray(values);
        
        //checks if any values entered had been entered four times consecutively
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        }
        else {
            System.out.println("The list has no consecutive fours");
        }
    }
    
    /** fillIntArray: reads in all elements in index order in a given integer array */ 
    public static int[] fillIntArray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
    /** isConsecutiveFour: checks elements in given array in index order for consecutive fours */
    public static boolean isConsecutiveFour(int[] values) {
        
        for (int i = 0; i < values.length - 3; i++) {
            boolean isEqual = true;
            for (int j = i; j < i + 3; j++){
                if (values[j] != values[j + 1]) {
                    isEqual = false; 
                    break;
                }
            }
            if (isEqual) {
                return true;
            }
         }
        return false;
    }
}
