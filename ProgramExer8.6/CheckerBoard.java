/**Program: Checker Board 
*File: CheckerBoard.java
*Summary: Program opens up checker board
*Author: Jake D. Babcock
*Date: November 16 , 2017
**/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckerBoard extends JPanel{

   //Creates JFrame, upon which the checkerboard will be placed on 
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600); // size of entire screen
        frame.getContentPane().add(new CheckerBoard());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.RED);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setVisible(true);
        
    }
        //fills black squares in checkerboard
        public void paint(Graphics g){
        g.fillRect(100, 100 , 400 , 400);
        for(int i = 100; i<=400; i+=100){
            for(int j = 100; j <=400; j+=100){
            g.clearRect(i, j, 50, 50);
        }
    }
        //places white squares in checker board
    for (int i = 150; i <=450; i+=100){
        for(int j = 150; j<= 450; j+=100){
            g.clearRect(i, j, 50, 50);
        }
    }
}
}
