import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class RengeInputTest {

    RengeInput Passenger1, Passenger2, Passenger3;

    @Test
    void setUp() {
        Passenger1 = new RengeInput(70,90);
        Passenger1.up();
        Passenger1.up();
        Passenger1.up();

        Passenger2 = new RengeInput(30,50);
        Passenger2.up();
        Passenger2.up();
        Passenger2.up();

        Passenger3= new RengeInput(40,60);
        Passenger3.up();
        Passenger3.up();
        Passenger3.up();

       assertEquals (83,Passenger1.getAvarageTemp());
        assertEquals (43,Passenger2.getAvarageTemp());
       assertEquals (53,Passenger3.getAvarageTemp());
    }
    @Test

    void setDown(){
        Passenger1 = new RengeInput(70,90);
        Passenger1.down();
        Passenger1.down();
        Passenger1.down();

        Passenger2 = new RengeInput(30,50);
        Passenger2.down();
        Passenger2.down();
        Passenger2.down();

        Passenger3 = new RengeInput(40,60);
        Passenger3.down();
        Passenger3.down();
        Passenger3.down();

        assertEquals (77,Passenger1.getAvarageTemp());
        assertEquals (37,Passenger2.getAvarageTemp());
        assertEquals (47,Passenger3.getAvarageTemp());

    }

}