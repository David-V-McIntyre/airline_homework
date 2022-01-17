import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        passenger1 = new Passenger("James", 2);
        passenger2 = new Passenger("Jesse", 3);
    }

    @Test
    public void hasName(){
        assertEquals("James", passenger1.getName());
        assertEquals("Jesse", passenger2.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger1.getNumberOfBags());
        assertEquals(3, passenger2.getNumberOfBags());
    }

}
