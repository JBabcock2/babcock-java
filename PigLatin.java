/**Program: Pig Latin Generator
*File: PigLatin.java
*Summary: This program will transfer text to Pig-Latin. 
*Author: Jake D. Babcock
*Date: October 18, 2017
**/
package piglatin;
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String userPhrase = "";
       
       
       
       do {
           String [] words;
           
           System.out.print("Enter your words here: ");
           userPhrase = input.nextLine();
           
           words = userPhrase.split(" ");
        
           for (String word : words)
           {
               if (word.startsWith("A") || word.startsWith("E") 
                       || word.startsWith("I")
                       || word.startsWith("O") || word.startsWith("U"))
                
                  System.out.println(word + "     " + word.toUpperCase()  + "WAY ");
                else if (word.startsWith("SH") || word.startsWith("CH") 
                        || word.startsWith("TH"))
                    System.out.println(word + "     " + word.substring(2).toUpperCase() + 
                        word.substring(0,2).toUpperCase() +"AY ");
                     
                else 
                   System.out.println(word + "     " + word.substring(1).toUpperCase() + 
                        word.substring(0,1).toUpperCase()+"AY "); 
                       
           }
           System.out.println();
           
         
       }
       while(!userPhrase.equals("quit"));
    }
}

              
       
       
       
       