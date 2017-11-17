/**Program: Random 3 Cards 
*File: Display3Cards.java
*Summary: Program will generate and show three random cards from 52 card deck
*Author: Jake D. Babcock
*Date: November 16 , 2017
**/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Display3Cards extends Application
{
    static ArrayList<Integer> decklist = new ArrayList<>();
    static int[] threeNums = new int[3];
    
    public static void main(String[] args)
    {
        store52Numbers();
        Collections.shuffle(decklist);
        chooseThree(threeNums);
        displayNum(threeNums);
        Application.launch(args);
    }        
    
    // Pulling the three random numbers, matching them to the corresponding 
    // image. Shows clean output. 
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Pane hbox = new HBox(50);
        Image card; 
      
        
        for (int i = 0; i < threeNums.length; i++)
        {
           card = new Image("cards/" + (threeNums[i]) + ".png");
           hbox.getChildren().add(new ImageView(card));
        }
        
        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Three Cards");
        primaryStage.show();
    }
    // this displays the three random numbers, which will be 
    // passed to the start public class. 
    
    public static void displayNum(int[] threeNums)
    {
        for (int i = 0; i < threeNums.length; i++)
        {
          System.out.print(threeNums[i] + " ");
        }
    }
    
    //gets random numbers 
    public static void chooseThree(int[] threeNums)
    {
        Random rand = new Random();
        int num; 
        int index = 0;
        
        for (int i = 52; i > 49; i--)
        {
            num = rand.nextInt(i);
            threeNums[index] = decklist.get(num);
            decklist.remove(num); // remove repeats. 
            index++;
        }  
    }      
    
    // store 52 numbers in array decklist. 
    public static void store52Numbers()
    {
        for (int i = 1; i <= 52; i++)
        {
            decklist.add(i);
        }
    }      
}