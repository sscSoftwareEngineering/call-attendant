/*
 * AUTHOR:  William Cordero
 * DATE:    05/2018
 * PURPOSE: Simulate a call button on an airplane
 */
package module1;

public class CallButton {
    //Public accessor methods
    public void push(){
        lightOn = !lightOn;
    }
    
    public void off() {
        lightOn = false;
    }
    
    public String getIdent()
        {return identifier;}
    public void setIdent(String name) {
        identifier = name;
    }
    
    public boolean getStatus() {
        return lightOn;
    }
    
    //Class variable
    private boolean lightOn = false;
    private String identifier = "";
}
