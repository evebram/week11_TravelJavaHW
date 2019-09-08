import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void setUp(){
        this.passenger1 = new Passenger("Sarah", 2);
    }

    @Test
    public void testGetName(){
        assertEquals("Sarah", passenger1.getName());
    }

    @Test
    public void testGetBagTotal(){
        assertEquals(2, passenger1.getBagTotal());
    }
}
