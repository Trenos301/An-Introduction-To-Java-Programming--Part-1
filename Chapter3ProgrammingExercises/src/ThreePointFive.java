/*
Class: ThreePointFive
Name: Whitney Boutin
Date: 1/31/2018

Desc: Reads in day of week, then reads in number of days elapsed from then.
      Displays resulting day name. (Completes exercise 3.5)
 */
import java.util.Scanner;

public class ThreePointFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompts user for week day number
        System.out.print("Enter today's day: ");
        int dayOfWeek = input.nextInt();
        
        //checks for invalid day
        if (dayOfWeek > 6 || dayOfWeek < 0) {
            System.out.println("INVALID DAY OF WEEK");
            return;
        }
        
        //prompts user for days elapsed
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();
        
        //checks for invalid elapsed day count
        if (daysElapsed < 0) {
            System.out.println("INVALID NUMBER OF ELAPSED DAYS");
            return;
        }
        
                
        String dayName = "";
        
        //finds current date name
        switch (dayOfWeek % 7) {
            case 0: dayName = "Sunday";
                    break;
            case 1: dayName = "Monday";
                    break;
            case 2: dayName = "Tuesday";
                    break;
            case 3: dayName = "Wednesday";
                    break;        
            case 4: dayName = "Thursday";
                    break;
            case 5: dayName = "Friday";
                    break;
            case 6: dayName = "Saturday";
                    break;
        }
        
        System.out.print("Today is " + dayName + " and the future day is ");
        
        int futureDay = (dayOfWeek + daysElapsed);
        
        switch (futureDay % 7) {
            case 0: dayName = "Sunday";
                    break;
            case 1: dayName = "Monday";
                    break;
            case 2: dayName = "Tuesday";
                    break;
            case 3: dayName = "Wednesday";
                    break;        
            case 4: dayName = "Thursday";
                    break;
            case 5: dayName = "Friday";
                    break;
            case 6: dayName = "Saturday";
                    break;
                }
        //display results
        System.out.println(dayName);
        
        
    }
}
