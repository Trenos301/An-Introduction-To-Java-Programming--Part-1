/*
Class: FivePointTwentyNine
Name: Whitney Boutin
Date: 2/13/2018

Desc: Reads in year and week name for jan 1st, and prints a calander.
      (Completes exercise 5.29)
 */
import java.util.Scanner;

public class FivePointTwentyNine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        String month = "";
        int year = 0, days = 0, dayOfWeek = 0, p = 0;
        
        System.out.print("Enter year: ");
        year = input.nextInt();
        
        System.out.print("Enter first day of year (1-7): ");
        dayOfWeek = input.nextInt();
        
        
        
        
        
        
        
        
        
        for (int i = 1; i <= 12; i++){
            
            switch (i) {
                case 1: month = "January"; break;
                case 2: month = "February"; break;
                case 3: month = "March"; break;
                case 4: month = "April"; break;
                case 5: month = "May"; break;
                case 6: month = "June"; break;
                case 7: month = "July"; break;
                case 8: month = "August"; break;
                case 9: month = "September"; break;
                case 10: month = "October"; break;
                case 11: month = "November"; break;
                case 12: month = "December"; break;
            }
            
            
            
            System.out.println("\n\n\t\t  " + month + " " + year);
            System.out.println("____________________" + "________________________________");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            
            
            
            
            if (month.equals("February") && year % 4 == 0) {
                month = "leapFebruary";
            }
            switch (month) {
                case "January": days = 31; break;
                case "February": days = 28; break; 
                case "leapFebruary": days = 29; break;
                case "March": days = 31; break;
                case "April": days = 30; break;
                case "May": days = 31; break;
                case "June": days = 30; break;
                case "July":
                case "August": days = 31; break;
                case "September": days = 30; break;
                case "October": days = 31; break;
                case "November": days = 30; break;
                case "December": days = 31; break;
                default: System.out.println("ERROR, INVALID");
            }
            switch(dayOfWeek) {
                case 1: break;
                case 2: System.out.print("\t"); break;
                case 3: System.out.print("\t\t"); break;
                case 4: System.out.print("\t\t\t"); break;
                case 5: System.out.print("\t\t\t\t"); break;
                case 6: System.out.print("\t\t\t\t\t"); break;
                case 7: System.out.print("\t\t\t\t\t\t"); break;
            }
            p = dayOfWeek;
            for (int j = 1; j <= days; j++){
                System.out.print(" " + j + "\t");
                if (p < 7){
                    p++;
                }
                else if (p >= 7) {
                    System.out.print("\n\n");
                    p = 1;
                }
                
            }
            dayOfWeek = p;
            System.out.println("\n\n");
        
        }
    }
}
