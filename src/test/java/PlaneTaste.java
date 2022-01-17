import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTaste {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canSetPlaneType() {
        plane.setPlaneType(PlaneType.BOEING757);
        assertEquals(PlaneType.BOEING757, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(524, plane.getPlaneCapacity());
    }

    @Test
    public void canGetWeight() {
        assertEquals(183500, plane.getPlaneWeight());
    }
}
