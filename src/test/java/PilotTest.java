import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.staff.Pilot;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    Plane plane;


    @Before
    public void before() {
        pilot = new Pilot("Mary", Rank.CAPTAIN, "PL45638");
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetName() {
        assertEquals("Mary", pilot.getName());
    }

    @Test
    public void canSetName() {
        pilot.setName("Jane");
        assertEquals("Jane", pilot.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canSetRank() {
        pilot.setRank(Rank.FIRST_OFFICER);
        assertEquals(Rank.FIRST_OFFICER, pilot.getRank());
    }

    @Test
    public void canGetPilotLicenceNum() {
        assertEquals("PL45638", pilot.getPilotLicenceNum());
    }

    @Test
    public void canSetPilotLicenceNum() {
        pilot.setPilotLicenceNum("DH65390");
        assertEquals("DH65390", pilot.getPilotLicenceNum());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("I'm flying the BOEING747", pilot.flyPlane(plane));
    }
}
