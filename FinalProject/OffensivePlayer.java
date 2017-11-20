/**Program: Offensive Player Class 
*File: OffensivePlayer.java
*Summary: Class that contains Offensive Player attributes and properties.
* Properties adjusted from Milestone 2,3,and 4 as these properties are more 
* suitable for the class. 
*Author: Jake D. Babcock / This is my own work. 
*Date: November 17, 2017
**/
package NFLDraft;

import java.util.Random;

public class OffensivePlayer extends NFLPlayer implements Celebrator
{
    private double passing;
    private double rec;
    private double passingAvg;
    private double rushing; 
    private double rushingAvg;
    private double rushingAttempts;
    private double td;
    private String position; 
    
    OffensivePlayer(String name, int age, int number, String team, float height, 
            float weight, String category, double passing, double rec,
            double passingAvg, double rushing, double rushingAvg,
            double rushingAttempts, double td, String position)
    {
      super(name, age, number, team, height, weight, "off");
      this.setPassing(passing);
      this.setRec(rec);
      this.setPassingAvg(passingAvg);
      this.setRushing(rushing);
      this.setRushingAvg(rushingAvg);
      this.setRushingAttempts(rushingAttempts);
      this.setTd(td);
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
   
    public double getPassing()
    {
        return passing;
    }       

    /**
     * @param passing the passing to set
     */
    public void setPassing(double passing) {
        this.passing = passing;
    }

    /**
     * @return the rec
     */
    public double getRec() {
        return rec;
    }

    /**
     * @param rec the rec to set
     */
    public void setRec(double rec) {
        this.rec = rec;
    }

    /**
     * @return the passingAvg
     */
    public double getPassingAvg() {
        return passingAvg;
    }

    /**
     * @param passingAvg the passingAvg to set
     */
    public void setPassingAvg(double passingAvg) {
        this.passingAvg = passingAvg;
    }

    /**
     * @return the rushing
     */
    public double getRushing() {
        return rushing;
    }

    /**
     * @param rushing the rushing to set
     */
    public void setRushing(double rushing) {
        this.rushing = rushing;
    }

    /**
     * @return the rushingAvg
     */
    public double getRushingAvg() {
        return rushingAvg;
    }

    /**
     * @param rushingAvg the rushingAvg to set
     */
    public void setRushingAvg(double rushingAvg) {
        this.rushingAvg = rushingAvg;
    }

    /**
     * @return the rushingAttempts
     */
    public double getRushingAttempts() {
        return rushingAttempts;
    }

    /**
     * @param rushingAttempts the rushingAttempts to set
     */
    public void setRushingAttempts(double rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
    }

    /**
     * @return the td
     */
    public double getTd() {
        return td;
    }

    /**
     * @param td the td to set
     */
    public void setTd(double td) {
        this.td = td;
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
