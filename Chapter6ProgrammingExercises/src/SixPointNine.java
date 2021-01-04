/*
Class: SixPointNine
Name: Whitney Boutin
Date: 2/27/2018

Desc: Prints out tables for meters to feet, and feet to meters
      (Completes exercise 6.9)
     
 */
public class SixPointNine {
    public static void main(String[] args) {
        
        //prints out header for tables
        System.out.println("Feet     Meters     |     Meters     Feet     \n" +
                           "----------------------------------------------");
        
        //prints tables
        for (double f = 1.0, m = 20.0; f <= 10; f++, m += 5) {
            System.out.println(f + "\t " + footToMeter(f) + "\t    |\t  " + m + 
                    "\t     " + meterToFoot(m));
        }
    }
    
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        double meter;
        final double METERS_TO_FEET = 0.305;
        meter = METERS_TO_FEET * foot;
        
        return meter;
    }
    
    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        double foot;
        final double FEET_TO_METERS = 3.279;
        foot = FEET_TO_METERS * meter;
        
        return foot;
    }
}
