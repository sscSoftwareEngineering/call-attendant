/*
 * AUTHOR:  William Cordero
 * DATE:    05/2018
 * PURPOSE: An application to simulate call buttons on an airplane
 */
package module1;

public class CallButtonSimFrame {
    CallButton[] buttons = new CallButton[5];
    
    public CallButtonSimFrame() {
        buttons[0] = new CallButton();
        buttons[1] = new CallButton();
        buttons[2] = new CallButton();
        buttons[3] = new CallButton();
        buttons[4] = new CallButton();
        
        buttons[0].setIdent("1A");
        buttons[1].setIdent("2B");
        buttons[2].setIdent("2A");
        buttons[3].setIdent("3B");
        buttons[4].setIdent("3A");
    }
}
