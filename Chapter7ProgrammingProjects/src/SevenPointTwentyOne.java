/*
Class: SevenPointTwentyOne
Name: Whitney Boutin
Date: 3/12/2018

Desc: Simulates a "bean machine" by reading in number of balls, and number of slots.
      Displays paths of each ball, and a histogram of the balls after falling.
      (Completes exercise 7.21)
 */
import java.util.Scanner;

public class SevenPointTwentyOne {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //prompts user to enter number of balls to drop in machine
        System.out.print("Enter the number of balls to drop: "); 
        int nOfBalls = input.nextInt();
        String[] ballPaths = new String[nOfBalls];
        //prompts user to enter number of slots in machine
        System.out.print("Enter the number of slots in the bean machine: ");
        int nOfSlots = input.nextInt();
        int[] slots = new int[nOfSlots];
        
        //drops balls and displays paths
        for (int i = 0; i < nOfBalls; i++) {
            ballPaths[i] = dropBalls(slots);
            System.out.println("\t" + ballPaths[i]);
        }
        
        //displays histogram of balls fallen
        System.out.println();
        displayHistogram(slots, nOfBalls);
        
        
    }
    
    /** dropBalls: Drops balls, and stores the location of the dropped balls*/
    public static String dropBalls(int[] slots) {
        int rand;
        String ballPath = "";
        for (int j = 0; j < slots.length - 1; j++) {
            rand = (int)(1 + Math.random() * 2);
            if (rand == 1) {
                ballPath += "L";
            }
            else {
                ballPath += "R";
            }
        }
        int position = getPositionOfBall(ballPath, 'R');
        slots[position]++;
        return ballPath;
    }
    /** getPositionOfBall: Checks for location of ball in machine */
    public static int getPositionOfBall(String str, char a) {
            
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) count++;

        }

        return count;
    }
    
    /** displayHistogram: Prints out histogram of bean machine */
    public static void displayHistogram(int[] slots, int nOfBalls) {
        
            while (!isStrEmpty(slots)) {
                
                if (isREmpty(slots, nOfBalls)) {
                    nOfBalls--;
                }
                for (int i = 0; i < slots.length; i++) {
                    
                    if (slots[i] >= nOfBalls) {
                        System.out.printf("%2c", 'O');
                        slots[i]--;
                    }
                    else System.out.printf("%2c", ' ');
                    
                }
                nOfBalls--;
                System.out.println("");
                
            }
            
    }
    
    /** isStrEmpty: Checks if string is empty */
    public static boolean isStrEmpty(int[] slots) {
        
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != 0) {
                return false;
            }
        }
        return true;
    }
    /** isREmpty: Checks if row is empty */
    public static boolean isREmpty(int[] slots, int rNumber) {
        
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == rNumber) {
                return false;
            }
        }
        return true;
    }
}

// 
