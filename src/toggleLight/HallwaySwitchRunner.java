package toggleLight;

public class HallwaySwitchRunner {
    public static void main(String[] args) {
        HallwaySwitch Switch  = new HallwaySwitch();

        System.out.println("Initial State:");
        System.out.println("Switch_1: " + Switch.getSwitch1State());
        System.out.println("Switch_2: " + Switch.geSwitch2State());
        System.out.println("Light State: " + Switch.getlight());
        System.out.println();

        Switch.toggleFirstSwitch();
        System.out.println("After toogle swtch_1:");
        System.out.println("Switch_1: " + Switch.getSwitch1State());
        System.out.println("Switch_2: " + Switch.geSwitch2State());
        System.out.println("Light State: " + Switch.getlight());
        System.out.println();

        Switch.togglSecondSwitch();
        System.out.println("After toogle swtch_2:");
        System.out.println("Switch_1: " + Switch.getSwitch1State());
        System.out.println("Switch_2: " + Switch.geSwitch2State());
        System.out.println("Light State: " + Switch.getlight());

        Switch.toggleFirstSwitch();
        System.out.println("Again toogle swtch_1:");
        System.out.println("Switch_1: " + Switch.getSwitch1State());
        System.out.println("Switch_2: " + Switch.geSwitch2State());
        System.out.println("Light State: " + Switch.getlight());
        System.out.println();

        Switch.togglSecondSwitch();
        System.out.println("Again toogle swtch_2:");
        System.out.println("Switch_1: " + Switch.getSwitch1State());
        System.out.println("Switch_2: " + Switch.geSwitch2State());
        System.out.println("Light State: " + Switch.getlight());
    }
}
