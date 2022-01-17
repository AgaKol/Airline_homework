import Planes.Flight;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.staff.CabinCrewMember;
import people.staff.Pilot;
import people.staff.Rank;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Pilot pilot;
    private Pilot pilot2;
    private CabinCrewMember cabinCrewMember;
    private CabinCrewMember cabinCrewMember2;
    private Passenger passenger;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Nancy", Rank.CAPTAIN, "VB74937");
        pilot2 = new Pilot("Nancy", Rank.CAPTAIN, "VB74937");
        cabinCrewMember = new CabinCrewMember("John", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Bob", Rank.PURSER);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(cabinCrewMember);
        cabinCrewMembers.add(cabinCrewMember2);
        passenger = new Passenger("Lily", 1);
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger);
        flight = new Flight(pilot, cabinCrewMembers, plane, "FR756", "EDI", "KRK", "11:45");
    }

    @Test
    public void testGetPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void testSetPilot() {
        flight.setPilot(pilot2);
        assertEquals(pilot2, flight.getPilot());
    }

    @Test
    public void testGetcCMembers() {
        assertEquals(cabinCrewMembers, flight.getcCMembers());
    }

    @Test
    public void testGetPassengers() {
        flight.addPassengers(passenger);
        assertEquals(passengers, flight.getPassengers());
    }

    @Test
    public void testGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void testSetPlane() {
        Plane plane2 = new Plane(PlaneType.AIRBUS_A330);
        flight.setPlane(plane2);
        assertEquals(plane2, flight.getPlane());
    }

    @Test
    public void testGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void testSetFlightNumber() {
        flight.setFlightNumber("FR098");
        assertEquals("FR098", flight.getFlightNumber());
    }

    @Test
    public void testGetDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void testSetDestination() {
        flight.setDestination("GLA");
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void testGetDepartureAirport() {
        assertEquals("KRK", flight.getDepartureAirport());
    }

    @Test
    public void testSetDepartureAirport() {
        flight.setDepartureAirport("WAW");
        assertEquals("WAW", flight.getDepartureAirport());
    }

    @Test
    public void testGetDepartureTime() {
        assertEquals("11:45", flight.getDepartureTime());
    }

    @Test
    public void testSetDepartureTime() {
        flight.setDepartureTime("10:30");
        assertEquals("10:30", flight.getDepartureTime());
    }

    @Test
    public void testAddPassengers() {
        flight.addPassengers(passenger);
        assertEquals(1, flight.checkPassengersNumber());
    }

    @Test
    public void testCheckPassengersNumber() {
        assertEquals(0, flight.checkPassengersNumber());
    }

    @Test
    public void testFindEmptySeatsNumber() {
        flight.addPassengers(passenger);
        assertEquals(523, flight.findEmptySeatsNumber());
    }

    @Test
    public void testBookPassenger() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(3, flight.checkPassengersNumber());
        assertEquals(flight, passenger.getFlight());
    }
}
