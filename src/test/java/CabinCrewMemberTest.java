import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.staff.CabinCrewMember;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember ccm;
    Passenger passenger;


    @Before
    public void before() {
        ccm = new CabinCrewMember("Sandy", Rank.FIRST_OFFICER);
        passenger = new Passenger("James", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Sandy", ccm.getName());
    }

    @Test
    public void canSetName() {
        ccm.setName("Sheila");
        assertEquals("Sheila", ccm.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.FIRST_OFFICER, ccm.getRank());
    }

    @Test
    public void canSetRank() {
        ccm.setRank(Rank.CAPTAIN);
        assertEquals(Rank.CAPTAIN, ccm.getRank());
    }

    @Test
    public void canTalkToPassengers() {
        assertEquals("Hello James, enjoy your flight.", ccm.talkToPassengers(passenger));
    }
}
