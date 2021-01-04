/*
Class: TwoPointSeven 
Name: Whitney Boutin
Date: 1/30/2018

Desc: Reads in minutes and converts to approximate days and years.
      Displays results. (Completes exercise 2.7)
 */
import java.util.Scanner;
        
public class TwoPointSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes, hours, years, days;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;
        final int DAYS_PER_YEAR = 365;
        
        //prompts user for minutes
        System.out.print("Enter number of minutes:");
        minutes = input.nextInt();
        
        //calculates days
        hours = minutes / MINUTES_PER_HOUR;
        days =  hours / HOURS_PER_DAY;
        
        //calculates years
        years = days / DAYS_PER_YEAR;
        
        //displays results
        System.out.print(minutes + " minutes is approximately " + years + 
                " years and " + days + " days\n");
    }
}
