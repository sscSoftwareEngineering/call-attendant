/*
 * AUTHOR:  William Cordero
 * DATE:    05/2018
 * PURPOSE: An GUI to access call buttons on an simulation airplane
 */
package module1;

import java.util.Scanner;

public class TestCallButtonSim {
    public static void main(String[] args) {
        CallButtonSimFrame frame = new CallButtonSimFrame();
        System.out.println("Call Attendant Simulator");
        getStatus(frame);
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("Enter the number of the seat you want to press the call button for");
        System.out.println("or enter " + (frame.buttons.length) + " to press the attendant's button and clear all lights.");
        System.out.println("Enter anything else to quit");
        
        while(true) {
            try {
                choice = in.nextInt();
            } catch (Exception e) {
                System.exit(0);
            }
            
            if (choice == (frame.buttons.length)) {
                for (CallButton button : frame.buttons) {
                    button.off();
                }
            } else if (choice >= 0 && choice < frame.buttons.length) {
                frame.buttons[choice].push();
            } else {
                System.exit(0);
            }
            getStatus(frame);
        }
    }
    
    private static void getStatus(CallButtonSimFrame frame) {
        System.out.println("The following are the available seats and their status");
        for (int count = 0; count < frame.buttons.length; count++) {
            CallButton button = frame.buttons[count];
            System.out.print(count + ") Seat " + button.getIdent() + "'s light is ");
            if (frame.buttons[count].getStatus()) {
                System.out.println("on");
            } else {
                System.out.println("off");
            }
        }
    }
}
