import Planes.Flight;
import Planes.FlightManager;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.staff.CabinCrewMember;
import people.staff.Pilot;
import people.staff.Rank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Pilot pilot;
    private Pilot pilot2;
    private CabinCrewMember cabinCrewMember;
    private CabinCrewMember cabinCrewMember2;
    private Passenger passenger;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private DateFormat dateFormat;

    @Before
    public void before() {
        flightManager = new FlightManager();
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
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        flight = new Flight(pilot, cabinCrewMembers, plane, "FR756", "EDI", "KRK", "11:45");

    }

    @Test
    public void canCheckBagsWeightPerPassenger() {
        assertEquals(175.0,flightManager.bagsWeightPerPassenger(flight), 0.0);
    }

    @Test
    public void canCheckBagsWeightBookedByPassengers() {
        flight.addPassengers(passenger);
        flight.addPassengers(passenger);
        assertEquals(350.0, flightManager.bagsWeightBookedByPassengers(flight), 0.0);
    }

    @Test
    public void canCheckRemainingWeightForBags() {
        flight.addPassengers(passenger);
        flight.addPassengers(passenger);
        assertEquals(91400.0, flightManager.remainingWeightForBags(flight), 0.0);
    }
}
