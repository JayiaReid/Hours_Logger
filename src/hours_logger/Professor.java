/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hours_logger;

/**
 *
 * @author jayia
 */
public class Professor extends Person {
    
    public Professor(String firstName, String lastName){
        super(firstName, lastName);
    }

    @Override
    public int getParticipateHours(int courseHours) {
        int hours = courseHours>4? courseHours-2: courseHours-1;
        this.participateHours=hours;
        return hours;
    }

    @Override
    public String getTitle() {
        return "Professor";
    }
    
}
