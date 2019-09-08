import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp(){
        this.flight = new Flight(1, "LDN", "EDN", "8:50AM");
        this.passenger1 = new Passenger("Maria", 2);
        this.passenger2 = new Passenger("Ethel", 1);
        this.passenger3 = new Passenger("Christina", 3);
    }

    @Test
    public void testGetFlightNumber(){
        assertEquals(1, flight.getFlightNumber() );
    }

    @Test
    public void testGetDestination(){
        assertEquals("LDN", flight.getDestination());
    }

    @Test
    public void testGetDepatureAirport(){
        assertEquals("EDN", flight.getDepatureAirport());
    }

    @Test
    public void testGetDepatureTime(){
        assertEquals("8:50AM", flight.getDepatureTime());
    }

    @Test
    public void testGetPassengers(){
        assertEquals(0, flight.getPassengers());
    }

    @Test
    public void testGetAvailableSeats(){
        assertEquals(3, flight.checkAvailableSeats());
    }

    @Test
    public void testCheckInPassenger(){
        flight.checkInPassenger(passenger1);
        assertEquals(1, flight.getPassengers());
    }


}
