/**Program: Addition Program
*File: Addition.java
*Summary: Allows user to input 5 random numbers and the output
*will sum all of them. 
*Author: Jake D. Babcock
*Date: October 11, 2017
**/

package exercise.pkg2;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user to input numbers
        System.out.print("Enter a 5-digit positive integer.");
        int digits = input.nextInt();
        
        //Retrieve the 5 digits from user
        int number5 = digits % 10;
        int remainingNumber1 = digits / 10;
        int number4 = remainingNumber1 % 10;
        int remainingNumber2 = remainingNumber1 / 10;
        int number3 = remainingNumber2 % 10;
        int remainingNumber3 = remainingNumber2 / 10;
        int number2 = remainingNumber3 % 10;
        int remainingNumber4 = remainingNumber3 / 10;
        int number1 = remainingNumber4 % 10;
        
        //add all of the numbers retrieved from input
        int sum = number5 + number4 + number3 + number2 + number1;
        
        //output the sum of each digit 
        System.out.println("The sum of the digits is " + number1 + " + " 
                + number2 + " + " + number3 + " + " + number4 + " + "
                + number5 + " = " + sum);
        
        
    }
    
}
