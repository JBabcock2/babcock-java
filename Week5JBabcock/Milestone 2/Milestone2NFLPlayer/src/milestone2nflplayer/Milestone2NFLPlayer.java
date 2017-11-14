/**Program: NFL Player Class Setup
*File: NFLPlayer.java
*Summary: This class is extracting NFLPlayer.java getters and setters,
* and testing them in a driver method. 
*Author: Jake D. Babcock
*Date: October 27, 2017
**/
package milestone2nflplayer;

public class Milestone2NFLPlayer {
    
    //Driver class, main class used to test Offense.java and Defense.java properties
    
    public static void main(String[] args) {
        
        //Testing getters and setters for Offense Player
        Offense offense_player1 = new Offense("Tom Brady","QB","Michigan"
        ,472,64123,40,0);
        
        //Testing getters and setters for Defense Player
        Defense defense_player1 = new Defense("JJ Watt","DE","Wisconsin",
        310,76,28);
        
        //Testing output of set variables for offense and defense
        System.out.println(offense_player1);
        System.out.println(defense_player1);
    
    }
    
}
