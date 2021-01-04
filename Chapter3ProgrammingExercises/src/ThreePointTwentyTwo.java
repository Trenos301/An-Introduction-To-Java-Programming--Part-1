/*
Class: ThreePointTwentyTwo
Name: Whitney Boutin
Date: 2/1/2018

Desc: Reads in coordinates for a point.
      Then checks if point is within a circle with a radius of 10.
      Displays results. (Completes exercise 3.22)
 */
import java.util.Scanner;

public class ThreePointTwentyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String point;
        int r = 10;
        //prompts user for point
        System.out.print("Enter a point with two coordinates: ");
        point = input.nextLine();
        
        //isolates individual coordinates of point
        String xs = null;
        String ys = null;
        for(int i = 0; i <= point.length();i++) 
        {
            if (point.charAt(i) == ' ')
            {
                xs = point.substring(0, i);
                ys = point.substring(i, point.length());
                
                break;
            }
        }
        System.out.println(xs + " " + ys);
        
        //converts coordinates into number
        double x = Double.parseDouble(xs);
        double y = Double.parseDouble(ys);
        System.out.println(x + " " + y);
        //checks if point is in circle(using pythagorian theorem)
        if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= r) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        }
        else {
            System.out.println("Point (" + x + ", " + y + 
                    ") is not in the circle");
        }
        //displays results
        
    }
}
