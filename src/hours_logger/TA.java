/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hours_logger;

/**
 *
 * @author jayia
 */
public class TA extends Person{
     public TA(String firstName, String lastName){
        super(firstName, lastName);
    }

    @Override
    public int getParticipateHours(int courseHours) {
        int Labhours = courseHours>4? 2: 1;
        return Labhours;
    }

    @Override
    public String getTitle() {
        return "TA";
    }
}
