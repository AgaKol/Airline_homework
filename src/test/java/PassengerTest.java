import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("James", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("James", passenger.getName());
    }

    @Test
    public void canSetName() {
        passenger.setName("Jessy");
        assertEquals("Jessy", passenger.getName());
    }

    @Test
    public void canGetBagsNumber() {
        assertEquals(2, passenger.getBagsNumber());
    }

    @Test
    public void canSetBagsNumber() {
        passenger.setBagsNumber(3);
        assertEquals(3, passenger.getBagsNumber());
    }
}
