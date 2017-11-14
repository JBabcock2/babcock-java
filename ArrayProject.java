/**Program: Array Example Program
*File: ArrayProject.java
*Summary: This program will break down a 2 dimensional character array
* and display in column major order. 
*Author: Jake D. Babcock
*Date: October 27, 2017
**/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayProject {  // begin TextFileExample class.
    public static void main(String[] args) {  // begin main method
		//Create variables
		String fileText = "";
		char[][] textArray;
		//try-catch for reading from a file
		try {  // begin try 
			BufferedReader br = new BufferedReader(new FileReader("ArrayProject.txt"));
                        
			
			String readLine = "";
                        
	
			while((readLine = br.readLine()) != null){ 
				fileText += readLine;
                                
                                
                                System.out.println(fileText);
			}  
                        
			br.close(); 
		    } // end try 
                catch (IOException e) { 
			e.printStackTrace();
		}  
                
		
		textArray = LoadArray(fileText);
		

		arrayOutput(textArray);
	      
     }  
 
    

         //Load the array into console
	public static char[][] LoadArray(String entireText){  
		char[][] textArray = new char[20][45];
		int count = 0;
		
		for (int i = 0; i < 20; i++){  
			for (int j = 0; j < 45; j++){  
				if (count < entireText.length()){ 
					textArray[i][j] = entireText.charAt(count);
                                        System.out.println(textArray[i][j]);
					count++;
				} 
                                else {  
					textArray[i][j] = '@';  // Character used to fill in spaces
				} 
				
			}  
		}  
		
		return textArray;
		
	}  
        
        //Loop through the array in column order and print to the console window
	private static void arrayOutput(char[][] textArray) {  
		StringBuilder columnText = new StringBuilder();  
		
		for (int i = 0; i < 45; i++){  
			for (int j = 0; j < 20; j++){ 
   			   columnText.append(textArray[j][i]);  // append the elements in the array to the String.
			}  
		}  
		
		System.out.println(columnText);  // Display the column string 
		
	}           
        
        
} 