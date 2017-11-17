/**Program: Color and font 
*File: CheckerBoard.java
*Summary: Program displays 5 vertical "javas" in different colors 
*Author: Jake D. Babcock
*Date: November 16 , 2017
**/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos; 
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class ColorAndFont extends Application {
    
    public static void main(String[] args)
{
Application.launch(args);
}
    @Override
    
    public void start(Stage primaryStage) 
    {
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setAlignment(Pos.CENTER);
        
        for (int i = 0; i < 5; i++) 
        {
            Text text = new Text("Java");
            text.setFont(Font.font("Times Roman", FontWeight.BOLD, 
                    FontPosture.ITALIC, 22));
            text.setRotate(90);
            
            text.setFill(new Color(Math.random(), Math.random()
            ,Math.random(), Math.random()));
            hBox.getChildren().add(text);
        }
        
        Scene scene = new Scene(hBox, 300,100);
        primaryStage.setTitle("JAVAAAA");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
