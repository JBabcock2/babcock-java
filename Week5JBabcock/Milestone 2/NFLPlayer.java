/**Program: NFL Player Class Setup
*File: NFLPlayer.java
*Summary: Program creates properties for the NFL Player Class
* 
*Author: Jake D. Babcock
*Date: October 27, 2017
**/
public class NFLPlayer {
        //Set up NFL Player's properties.
        //Strings for non-numeric variables, int's for numeric variables.
     
     private String name;
     private String offenseOrDefense;
     private String position;
     private String college;
     private int touchdownCount;
     private int totalYards;  
     private int age;
     private int receptions;
     private int sacks;
     private int tackles;
 

     
     public String getName(){
        return name;
}      
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the offenseOrDefense
     */
    public String getOffenseOrDefense() {
        return offenseOrDefense;
    }

    /**
     * @param offenseOrDefense the offenseOrDefense to set
     */
    public void setOffenseOrDefense(String offenseOrDefense) {
        this.offenseOrDefense = offenseOrDefense;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @return the touchdownCount
     */
    public int getTouchdownCount() {
        return touchdownCount;
    }

    /**
     * @param touchdownCount the touchdownCount to set
     */
    public void setTouchdownCount(int touchdownCount) {
        this.touchdownCount = touchdownCount;
    }

    /**
     * @return the totalYards
     */
    public int getTotalYards() {
        return totalYards;
    }

    /**
     * @param totalYards the totalYards to set
     */
    public void setTotalYards(int totalYards) {
        this.totalYards = totalYards;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the receptions
     */
    public int getReceptions() {
        return receptions;
    }

    /**
     * @param receptions the receptions to set
     */
    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    /**
     * @return the sacks
     */
    public int getSacks() {
        return sacks;
    }

    /**
     * @param sacks the sacks to set
     */
    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    /**
     * @return the tackles
     */
    public int getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(int tackles) {
        this.tackles = tackles;
    }
    

    }
    

