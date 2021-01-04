/*
Class: FourPointThirteen
Name: Whitney Boutin
Date: 2/2/2018

Desc: Reads in character, checks if character is a vowel or a consonant.
      Displays results. (Completes exercise 1.13)
 */
import java.util.Scanner;

public class FourPointThirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompts user for character
        System.out.print("Enter a letter: ");
        char c = input.nextLine().charAt(0);
        
        //checks if consonant or vowel
            boolean isConsonant = true;
        
            if (c >= 'a' && c <= 'z') {
                switch (c){
                    case 'a': isConsonant = false; break;
                    case 'b':
                    case 'c':
                    case 'd': isConsonant = true; break;
                    case 'e': isConsonant = false; break;
                    case 'f': 
                    case 'g':
                    case 'h': isConsonant = true; break;
                    case 'i': isConsonant = false; break;
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n': isConsonant = true; break;
                    case 'o': isConsonant = false; break;
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't': isConsonant = true; break;
                    case 'u': isConsonant = false; break;
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z': isConsonant = true; break;
                }            
            }
            else if (c >= 'A' && c <= 'Z') {
                switch (c) {            
                    case 'A': isConsonant = false; break;
                    case 'B':
                    case 'C':
                    case 'D': isConsonant = true; break;
                    case 'E': isConsonant = false; break;
                    case 'F':
                    case 'G':
                    case 'H': isConsonant = true; break;
                    case 'I': isConsonant = false; break;
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N': isConsonant = true; break;
                    case 'O': isConsonant = false; break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T': isConsonant = true; break;
                    case 'U': isConsonant = false; break;
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z': isConsonant = true; break;
                }
            }
            else {
                System.out.println(c + " is an invalid input"); return;
            }
            //Displays results
            if (isConsonant) {
                System.out.println(c + " is a consonant");
            }
            else {
                System.out.println(c + " is a vowel");
            }
            
        }
        
    
}
