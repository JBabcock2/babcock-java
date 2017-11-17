/**Program: Defensive Player Class
*File: DefensivePlayer.java
*Summary: Defense players getters/setters. toString method. 
*Author: Jake D. Babcock
*Date: November 12, 2017
**/
package milestone2nflplayer;

public class DefensivePlayer {
    
     private String name;
     private String position;
     private String college;
     private int age;
     private int sacks;
     private int tackles;
     
     //reorganized getters and setters for defense class
     DefensivePlayer(String name, String position, String college, 
            int age, int sacks, int tackles){
     this.name = name;
     this.position = position;
     this.college = college;
     this.tackles = tackles;
     this.age = age;
     this.sacks = sacks;
               
               
    }
    
    public String toString(){
        return name + " Position: " + position + " College: " + college +
                " Tackles: " + tackles +
                " Sacks: " + sacks + " Age: " + age;
               
    }
}
     

