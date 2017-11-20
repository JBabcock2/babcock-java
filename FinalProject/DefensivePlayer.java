/**Program: Defensive Player Class
*File: DefensivePlayer.java
*Summary: Class that contains Defensive Player attributes and properties. 
* Properties adjusted from Milestone 2,3,and 4 as these properties are more 
* suitable for the class. 
*Author: Jake D. Babcock / This is my own work. 
*Date: November 17, 2017
**/
package NFLDraft;

import java.util.Random;

public class DefensivePlayer extends NFLPlayer implements Celebrator 
{
    private double tackles;
    private double sacks;
    private double inter;
    private String position;
    
    DefensivePlayer(String name, int age, int number, String team, float height,
    float weight, String category, double tackles, double ast, double comb
         , double sacks, double inter, String position)
    {
        super(name, age, number, team, height, weight, "def");
        this.setTackles(tackles);
        this.setSacks(sacks);
        this.setInter(inter);
        this.setPosition(position);
    }      
    
        @Override
    public String celebrate()
    {
        int r = new Random().nextInt(4);
        String message = "";
        switch(r)
        {
            case 0: message = " jumps around to celebrate draft";
            break;
            case 1: message = " does a hand stand to celebrate draft";
            break;
            case 2: message = " buys a vacation home to celebrate draft";
            break; 
            case 3: message = " eats McDonalds to celebrate his draft";
            break;
            case 4: message = " goes to Las Vegas and loses money to celebrate draft";
            break;
            
        }
        return getName() + message;
    }
    
    public double getTackles(double tackles)
    {
        this.setTackles(tackles);
        return 0;
    }      

    /**
     * @return the tackles
     */
    public double getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(double tackles) {
        this.tackles = tackles;
    }


    /**
     * @return the sacks
     */
    public double getSacks() {
        return sacks;
    }

    /**
     * @param sacks the sacks to set
     */
    public void setSacks(double sacks) {
        this.sacks = sacks;
    }

    /**
     * @return the inter
     */
    public double getInter() {
        return inter;
    }

    /**
     * @param inter the inter to set
     */
    public void setInter(double inter) {
        this.inter = inter;
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
}
