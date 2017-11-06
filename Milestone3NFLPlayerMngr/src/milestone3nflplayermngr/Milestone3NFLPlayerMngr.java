

package milestone3nflplayermngr;

import java.util.ArrayList;
import java.util.List;

public class Milestone3NFLPlayerMngr {

    public static void main(String[] args) {
        
        List<Defense> dPlayers = new ArrayList<>();
            for (int i = 0; i < 3; i++){
                
            
        dPlayers.add(new Defense("JJ Watt","DE","Wisconsin",28,76,310));
        dPlayers.add(new Defense("Zach Brown","ILB","North Carolina",28,16,485));
        dPlayers.add(new Defense("Demarcus Lawrence","DE","Boise State",25,20,69));
            }
                
        List<Offense> oPlayers = new ArrayList<>();
            for (int i = 0; i < 3; i++){
        
        oPlayers.add(new Offense("Tom Brady","QB","Michigan",472,64123,40,0));
        oPlayers.add(new Offense("Kareem Hunt","RB","Toldeo",4,763,22,2));
        oPlayers.add(new Offense("Antonio Brown","WR","Central Michigan",53,9212,29,689));
            }
   
        
        System.out.println(oPlayers.toString().replace("["," ").replace("]",""));
        System.out.println(dPlayers.toString().replace("["," ").replace("]",""));
    
    }
}
            
    
    
        
   

