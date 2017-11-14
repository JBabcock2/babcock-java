/**Program: Offensive Player Class
*File: OffensivePlayer.java
*Summary: Offense players getters/setters. toString method. 
*Author: Jake D. Babcock
*Date: November 12, 2017
**/
package milestone2nflplayer;

public class OffensivePlayer {
    
    private String name;
    private String position;
    private String college;
    private int touchdownCount;
    private int totalYards; 
    private int age;
    private int receptions;
    
    //reorganized getters and setters for offense class
    OffensivePlayer(String name, String position, String college, 
            int touchdownCount, int totalYards, int age, int receptions){
        this.name = name;
        this.position = position;
        this.college = college;
        this.touchdownCount = touchdownCount;
        this.totalYards = totalYards;
        this.age = age;
        this.receptions = receptions;
               
               
    }
    
    public String toString(){
        return name + " Position: " + position + " College: " + college +
                " Touchdown Count: " + touchdownCount +
                " Total Yards: " + totalYards + " Age: " + age +
                " Receptions: " + receptions;
    }
}
