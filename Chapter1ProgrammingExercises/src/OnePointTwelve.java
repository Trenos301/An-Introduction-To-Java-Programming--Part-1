/*
Program: OnePointTwelve
Name: Whitney Boutin
Date: 1/29/2018

Desc: Takes given miles per time, and translates into approximate kph.
      (Completes exercise 1.12)
*/
public class OnePointTwelve {
    public static void main(String[] args) {
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double nOfMiles = 24;
        final double KILOMETERS_PER_MILE = 1.6;
        
        //converting miles to kilometers
        double nOfKilometers = nOfMiles * KILOMETERS_PER_MILE;
        
        
        //converting total time into minutes
        double totalTimeMinutes = (hours * 60.0) + minutes + (seconds/60.0);
        
        
        //calculating kilometers per hour
        double kph = 60 * (nOfKilometers / totalTimeMinutes);
        
        
        //displays results
        System.out.println("24 mph is approximately " + kph + " kph");
        
        
        
    }
}
