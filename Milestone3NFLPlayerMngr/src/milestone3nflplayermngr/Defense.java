/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone3nflplayermngr;

public class Defense {
    
     private String name;
     private String position;
     private String college;
     private int age;
     private int sacks;
     private int tackles;
     
     Defense(String name, String position, String college, 
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
