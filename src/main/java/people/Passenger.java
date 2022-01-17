package people;

import Planes.Flight;

public class Passenger extends Person{

    private int bagsNumber;
    private int seatNumber;
    private Flight flight;

    public Passenger(String name, int bagsNumber) {
        super(name);
        this.bagsNumber = bagsNumber;
        this.seatNumber = seatNumber;
        this.flight = flight;
    }

    public int getBagsNumber() {
        return bagsNumber;
    }

    public void setBagsNumber(int bagsNumber) {
        this.bagsNumber = bagsNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
