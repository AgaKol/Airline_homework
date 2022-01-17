package Planes;

import Planes.Plane;
import people.Passenger;
import people.staff.CabinCrewMember;
import people.staff.Pilot;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cCMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cCMembers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cCMembers = cCMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrewMember> getcCMembers() {
        return cCMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addPassengers(Passenger passenger) {
        passengers.add(passenger);
    }

    public int checkPassengersNumber() {
       return passengers.size();
    }

    public int findEmptySeatsNumber() {
        int capacity = plane.getPlaneCapacity();
        int passengers = checkPassengersNumber();
        return capacity - passengers;
    }

    public void bookPassenger(Passenger passenger) {
        int min = 1;
        int max = plane.getPlaneCapacity();
        if (findEmptySeatsNumber() > 0 ) {
            addPassengers(passenger);
            passenger.setFlight(this);
            passenger.setSeatNumber((int) Math.floor(Math.random()*(max-min+1)+min)
            );
        }
    }
}
