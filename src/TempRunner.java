public class TempRunner {
    public static void main(String[] args) {
        RengeInput  Passenger =new  RengeInput(70,90);
        System.out.println("Current temperature" + " " + Passenger.getAvarageTemp());
        Passenger.up();
        Passenger.up();
        System.out.println("After increae the current temperature" + " " + Passenger.getAvarageTemp());
        Passenger.down();
        Passenger.down();
        System.out.println("After decrease the current temperature" + " " + Passenger.getAvarageTemp());
    }
}

