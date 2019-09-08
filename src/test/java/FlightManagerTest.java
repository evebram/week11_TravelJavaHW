import org.junit.Before;

import java.util.ArrayList;

public class FlightManagerTest {

    @Before
    public void setUp(){
        Passenger passenger1 = new Passenger("Kirsty", 2);
        Passenger passenger2 = new Passenger("Mhairi", 1);
        Passenger passenger3 = new Passenger("Sally", 3);
        Plane plane = new Plane(PlaneType.AIRBUS900);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        Flight flight = new Flight(1, plane, "LDN", "EDN", "09:20AM");
        passengers.add(passenger1);
        passengers.add(passenger2);
    }
}
