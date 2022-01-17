package Planes;

public class Plane {
    PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getPlaneWeight() {
        return planeType.getWeight();
    }

    public int getPlaneCapacity() {
        return planeType.getCapacity();
    }

}
