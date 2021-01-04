/*
Class: ThreePointFive
Name: Whitney Boutin
Date: 1/31/2018

Desc: Rock Paper Scissors game(Reads in 0 1 or 2 and generates random from 0-2)
      (Completes exercise 3.17)
 */
import java.util.Scanner;

public class ThreePointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompts user for selection
        System.out.print("scissor (0), rock(1), paper(2): ");
        int userSelection = input.nextInt();
        
        
        //generates random number
        double randomNumber = Math.random() * 10;
        while (randomNumber == 0) {
            randomNumber = Math.random() * 10;
        }
        
        int computerSelection = 0; 
        
        switch ((int)randomNumber % 3) {
            case 0: computerSelection = 0;
                    break;
            case 1: computerSelection = 1;
                    break;
            case 2: computerSelection = 2;
        }
        
        //converts answers into text format
        String computerAnswer = "";
        String userAnswer = "";
        
        switch (computerSelection) {
            case 0: computerAnswer = "scissor";
                    break;
            case 1: computerAnswer = "rock";
                    break;
            case 2: computerAnswer = "paper";
                    break;
        }
        switch (userSelection) {
            case 0: userAnswer = "scissor";
                    break;
            case 1: userAnswer = "rock";
                    break;
            case 2: userAnswer = "paper";
                    break;
        }
        if ("scissor".equals(computerAnswer) && "paper".equals(userAnswer) ||
                "rock".equals(computerAnswer) && "scissor".equals(userAnswer) ||
                "paper".equals(computerAnswer) && "rock".equals(userAnswer)) {
            System.out.println("The computer is " + computerAnswer + 
                    ". You are " + userAnswer + ". You lost");
        }
        else if ("paper".equals(computerAnswer) && "scissor".equals(userAnswer) ||
                "scissor".equals(computerAnswer) && "rock".equals(userAnswer) ||
                "rock".equals(computerAnswer) && "paper".equals(userAnswer)) {
            System.out.println("The computer is " + computerAnswer +
                    ". You are " + userAnswer + ". You won");
        }
        else if (computerAnswer == userAnswer) {
            System.out.println("The computer is " + computerAnswer +
                    ". You are " + userAnswer + " too. It is a draw");
        }
        else {
            System.out.println("INVALID ENTRY");
        }
        
    }
}
