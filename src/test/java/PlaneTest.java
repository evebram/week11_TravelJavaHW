import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void setUp(){
        this.plane1 = new Plane(PlaneType.AIRBUS900);
        this.plane2 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void testGetPlaneType(){
        assertEquals(PlaneType.AIRBUS900, plane1.getPlaneType());
    }

    @Test
    public void testGetPlaneCapacity(){
        assertEquals(15, plane1.getPlaneCapacity());
    }

    @Test
    public void testGetPlaneWeight(){
        assertEquals(10, plane2.getPlaneWeight());
    }
}
