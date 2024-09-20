/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hours_logger;

import java.util.Arrays;

/**
 *
 * @author jayia
 */
public abstract class Person implements ParticipateHours {
    
    protected String firstName;
    protected String lastName;
    protected int participateHours;
    
    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.participateHours=0;
    }
    
    @Override
   public abstract int getParticipateHours(int courseHours);
   
   public String getFullName(){
       return firstName + " " + lastName;
   }
   
   public void addHours(int hours){
       this.participateHours+=getParticipateHours(hours);
   }
   
   public int getHours(){
       return this.participateHours;
   }
   
   public abstract String getTitle();
    
}
