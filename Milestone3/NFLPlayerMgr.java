/**Program: NFL Player Class Setup
*File: NFLPlayer.java
*Summary: This class is extracting NFLPlayer.java getters and setters,
* and testing them in a driver method. 
*Author: Jake D. Babcock
*Date: October 27, 2017
**/
package milestone2nflplayer;

import java.util.ArrayList;
import java.util.List;

public class NFLPlayerMgr {

    public static void main(String[] args) {
            List<DefensivePlayer> dPlayers = new ArrayList<>();
            for (int i = 0; i < 3; i++){
                
            
        dPlayers.add(new DefensivePlayer("JJ Watt","DE","Wisconsin",28,76,310));
        dPlayers.add(new DefensivePlayer("Zach Brown","ILB","North Carolina",28,16,485));
        dPlayers.add(new DefensivePlayer("Demarcus Lawrence","DE","Boise State",25,20,69));
            }
                
        List<OffensivePlayer> oPlayers = new ArrayList<>();
            for (int i = 0; i < 3; i++){
        
        oPlayers.add(new OffensivePlayer("Tom Brady","QB","Michigan",472,64123,40,0));
        oPlayers.add(new OffensivePlayer("Kareem Hunt","RB","Toldeo",4,763,22,2));
        oPlayers.add(new OffensivePlayer("Antonio Brown","WR","Central Michigan",53,9212,29,689));
            }
   
        
        System.out.println(oPlayers.toString().replace("["," ").replace("]",""));
        System.out.println(dPlayers.toString().replace("["," ").replace("]",""));
    
    }
}
    

    
