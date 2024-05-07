package togolingLight;

public class HallwayLightSwitch {
    private int switch1State, switch2State, lightState;

    public HallwayLightSwitch() {
        switch1State =   switch2State =  lightState = 0;
    }
    public void toggleFirstSwitch() {
        switch1State = (switch1State + 1) % 2;
        updateLightState();
    }
    public void toggleSecondSwitch() {
        switch2State = (switch2State + 1) % 2;
        updateLightState();
    }
    private void updateLightState() {
        lightState = (switch1State + switch2State) % 2;
    }
    public int getFirstSwitchState() {
        return switch1State;
    }
    public int getSecondSwitchState() {
        return switch2State;
    }
    public int getLightState() {
        return lightState;
    }
}




