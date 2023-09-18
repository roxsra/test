/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7_136744;

/**
 *
 * Name: Afnan Faisal Al Ali
 * ID: 136744
 * sec: 10
 * 
 * @author afnanalali
 * 
 * purpose: get the current time in hours and minutes, set an alarm to a specific time
 *          , and get the time in a specific area using time zone difference value.

 */
public class Lab7_136744 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clock time = new Clock();
        System.out.println("the current hour: "+time.getHours());
        System.out.println("the current minute: "+time.getMinutes());
        System.out.println("the current time: "+time.getTime());
        //change the alarm values to your current time to test is please.
        time.setAlarm(17, 24);
        //create an object from the WorldClock class and specify the time zone 
        //diffrence value.
        WorldClock worldClock = new WorldClock(3);
        System.out.println("My Time (with time zone diffrence): " + worldClock.getTime());
        
        
    }
    
}
