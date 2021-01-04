/*
Program: OnePointEight
Name: Whitney Boutin
Date: 1/29/2018

Desc: Takes circle with radius of 5.5 and displays the area and perimeter of it.
      (Completes Exercise 1.8)
*/


public class OnePointEight {
    public static void main(String[] args) {
        double p, a;
        double r = 5.5;
        //finds perimeter
        p = 2 * r * Math.PI;
        
        //finds area
        a = r * r * Math.PI;
        
        //displays results
        System.out.print("The perimeter of circle with radius of " + r + 
                " is " + p + ", and the area of said circle is " + a + ".\n");
    }
}
