/** Program: Temperature Converter
 * File: FahrenheitToCelcius.java
 * Summary: Allows user to convert Fahrenheit to Celsius
 * and Celsius to Fahrenheit
 * Author: Jake D. Babcock
 * Date: October 13, 2017
 **/
package fahrenheittocelcius;

import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Receive input from user for Fahrenheit
        System.out.print("Enter a Fahrenheit temperature: ");
        double fahrenheit1 = input.nextDouble();
        
        //Convert Fahrenheit to Celsius
        double celsius1 = (fahrenheit1 - 32) * (5.0 / 9);
        System.out.println(fahrenheit1 + "F" + " is equivalent to " + 
                celsius1 + "C");
        
        //Receive input from user for Celcius
        System.out.println("Enter a Celsius Temperature: ");
        double celsius2 = input.nextDouble();
        
        //Convert Celsius to Fahrenheit
        double fahrenheit2 = (celsius2 * (9.0 / 5) + 32);
        System.out.println(celsius2 + "C" + " is equivalent to " +
                fahrenheit2 + "F");
        
     
    }

}
