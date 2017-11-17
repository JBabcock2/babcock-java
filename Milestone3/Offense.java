
package milestone3nflplayermngr;

public class Offense {
    
    private String name;
    private String position;
    private String college;
    private int touchdownCount;
    private int totalYards; 
    private int age;
    private int receptions;
    
    Offense(String name, String position, String college, 
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