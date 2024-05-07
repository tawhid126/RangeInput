package togolingLight;
public class HallwayLightSwitchRunner {
    public static void main(String[] args) {
        HallwayLightSwitch Switch = new HallwayLightSwitch();

        System.out.println("Initial State:");
        System.out.println("Switch 1: " + Switch.getFirstSwitchState());
        System.out.println("Switch 2: " + Switch.getSecondSwitchState());
        System.out.println("Light: " + Switch.getLightState());

        Switch.toggleFirstSwitch();
        System.out.println("After toggling Switch 1:");
        System.out.println("Switch 1: " + Switch.getFirstSwitchState());
        System.out.println("Switch 2: " + Switch.getSecondSwitchState());
        System.out.println("Light: " + Switch.getLightState());

        Switch.toggleSecondSwitch();
        System.out.println("After toggling Switch 2:");
        System.out.println("Switch 1: " + Switch.getFirstSwitchState());
        System.out.println("Switch 2: " + Switch.getSecondSwitchState());
        System.out.println("Light: " + Switch.getLightState());

        Switch.toggleFirstSwitch();
        System.out.println("After toggling Switch 1 again:");
        System.out.println("Switch 1: " + Switch.getFirstSwitchState());
        System.out.println("Switch 2: " + Switch.getSecondSwitchState());
        System.out.println("Light: " + Switch.getLightState());

        Switch.toggleSecondSwitch();
        System.out.println("After toggling Switch 2 again:");
        System.out.println("Switch 1: " + Switch.getFirstSwitchState());
        System.out.println("Switch 2: " + Switch.getSecondSwitchState());
        System.out.println("Light: " + Switch.getLightState());
    }
}
