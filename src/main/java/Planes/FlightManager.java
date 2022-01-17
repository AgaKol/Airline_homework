package Planes;

import Planes.Flight;

public class FlightManager {


    public FlightManager() {
    }

    public double bagsWeightPerPassenger(Flight flight) {
        int weight = flight.getPlane().getPlaneWeight() / 2;
        return weight / flight.getPlane().getPlaneCapacity();
    }

    public double bagsWeightBookedByPassengers(Flight flight) {
        return  bagsWeightPerPassenger(flight) * flight.checkPassengersNumber();
    }

    public double remainingWeightForBags(Flight flight) {
        int weight = flight.getPlane().getPlaneWeight()/2;
        double bags = bagsWeightPerPassenger(flight) * flight.checkPassengersNumber();
        return weight - bags;
    }
}
