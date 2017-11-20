/**Program: NFL Player Class  
*File: NFLPlayer.java
*Summary: Universal attributes for NFL Players, abstract class.   
*Author: Jake D. Babcock / This is my own work. 
*Date: November 17, 2017
**/

package NFLDraft;

import java.util.Random;




public abstract class NFLPlayer implements Celebrator {
    
    private String name;
    private int age; 
    private int number; 
    private String team;
    private float height;
    private float weight;
    private String status = "available";
    private String category;
   
    NFLPlayer()
    {
        setName("");
        setAge(0);
        setNumber(0);
        setTeam("");
        setHeight(0);
        setWeight(0);
        setCategory("");
    }       
    
    NFLPlayer(String name, int age, int number, String team, 
            float height, float weight, String category)
    {
        this.setName(name);
        this.setAge(age);
        this.setNumber(number);
        this.setTeam(team);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCategory(category);
                
    }      
    
    public String getName()
    {
        return name; 
    }      

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the status
     * needed to add status as so they can be removed if selected 
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
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
 }       
    

