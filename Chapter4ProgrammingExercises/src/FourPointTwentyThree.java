/*
Class: FourPointThirteen
Name: Whitney Boutin
Date: 2/2/2018

Desc: Reads in user information and tax withholding rates(federal and state).
      Then prints out payroll statement. (Completes exercise 4.23)
 */
import java.util.Scanner;

public class FourPointTwentyThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declares input variables
        String name = "";
        double hoursWorked, payRate, fedTaxRate, stateTaxRate;
        
        //prompts user for employee name
        System.out.print("Enter employee's name: ");
        name = input.nextLine();
        
        //prompts user for hours worked(weekly)
        System.out.print("Enter number of hours worked in a week: ");
        hoursWorked = input.nextDouble();
        
        //prompts user for pay rate(hourly)
        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();
        
        //prompts user for federal tax withholding rate
        System.out.print("Enter federal tax withholding rate: ");
        fedTaxRate = input.nextDouble();
        
        //prompts user for state tax withholding rate
        System.out.print("Enter state tax withholding rate: ");
        stateTaxRate = input.nextDouble();
        
        //calculates gross pay
        double grossPay = hoursWorked * payRate;
        
        //calculates individual deductions, and total deduction
        double fedWithholding = grossPay * fedTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = stateWithholding + fedWithholding;
        double netPay = grossPay - totalDeduction;
        
        //prints payroll
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + fedTaxRate + "%): $" +
                fedWithholding);
        System.out.println("  State Withholding (" + stateTaxRate + "%): $" +
                stateWithholding);
        System.out.println("  Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
