package toggleLight;

public class HallwaySwitch {
    public boolean  switch1State, switch2State, light;

    public HallwaySwitch() {
        light = switch1State = switch2State = false;

    }

    public HallwaySwitch(boolean switch2State, boolean switch1State, boolean light) {
        this.switch1State = switch1State;
        this.switch2State = switch2State;
        this.light = light;
    }
    public void toggleFirstSwitch(){
        switch1State = !switch1State;
    }

    public boolean getSwitch1State() {
        return switch1State;
    }

    public void togglSecondSwitch(){
        switch2State = !switch2State;
    }

    public boolean geSwitch2State() {
        return switch2State;
    }

    public boolean getlight() {
        return (switch1State != switch2State );
    }
}
