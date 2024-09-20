/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hours_logger;

/**
 *
 * @author jayia
 */
public class Student extends Person{
    
    public Student(String firstName, String lastName){
        super(firstName, lastName);
    }
    
    @Override
    public int getParticipateHours(int courseHours){
        this.participateHours=courseHours;
        return courseHours;
    }

    @Override
    public String getTitle() {
        return "Student";
    }
    
    
}
