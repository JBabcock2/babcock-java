/**Program: Random Number Guessing Program
*File: GuessingGame.java
*Summary: Program generates random number between 1-10000, user 
* must guess number while program gives feedback on each guess. 
* Once number is guess, it will output how many guesses it took 
* and inform them they are correct.
*Author: Jake D. Babcock
*Date: October 17, 2017
**/
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
    // Generate random number between 1-10000
    int startNumber1 = 1;
    int startNumber2 = 10000;      
    int number = (int)(Math.random() * startNumber2 );
    int numberOfAttempts = 0;
    

    
    System.out.print(" Enter a guess between " + (startNumber1) +
            " - " + startNumber2 + ": ");
    
    boolean win = false;
    
    while (win == false){
   

    Scanner input = new Scanner(System.in);
    int guess = input.nextInt();
    numberOfAttempts++;

               
    if (number == guess) {
        win = true;
    }  
    else if (number < guess) {
        System.out.println(" Lower ");
        System.out.println();
        System.out.println(" Enter a guess between " + startNumber1
         + " - " + (guess - 1) + ":");
        
    }
    else if (number > guess) {
        System.out.println(" Higher ");
        System.out.println();
        System.out.println(" Enter a guess between " + (guess + 1)
         + " - " + startNumber2 + ":");
        
    }    
    
    }   
    
    System.out.println(" You WIN. It took you " + numberOfAttempts + 
                 " guesses ");      
    }

}
