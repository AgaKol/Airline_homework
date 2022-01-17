package people.staff;

import Planes.Plane;
import Planes.PlaneType;

public class Pilot extends CabinCrewMember{

    String pilotLicenceNum;

    public Pilot(String name, Rank rank, String pilotLicenceNum) {
        super(name, rank);
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String getPilotLicenceNum() {
        return pilotLicenceNum;
    }

    public void setPilotLicenceNum(String pilotLicenceNum) {
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String flyPlane(Plane plane) {
        PlaneType planeType = plane.getPlaneType();
        return "I'm flying the " + planeType;
    }
}
