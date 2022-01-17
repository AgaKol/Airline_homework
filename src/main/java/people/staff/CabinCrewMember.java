package people.staff;

import people.Passenger;
import people.Person;

public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String talkToPassengers(Passenger passenger) {
       String passengerName = passenger.getName();
       return "Hello " + passengerName + ", enjoy your flight.";
    }
}
