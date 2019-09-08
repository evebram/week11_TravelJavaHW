import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private int flightNumber;
    private String destination;
    private String depatureAirport;
    private String depatureTime;
    private Plane plane;
    private Passenger passenger;

    public Flight(int flightNumber, Plane plane, String destination, String depatureAirport, String depatureTime){
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depatureAirport = depatureAirport;
        this.depatureTime = depatureTime;
        this.plane = new Plane(PlaneType.AIRBUS900);
        this.passenger = passenger;
    }

    public Plane getPlane(){
        return plane;
    }

    public int getPassengers(){
        return this.passengers.size();
    }

    public int getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepatureAirport(){
        return this.depatureAirport;
    }

    public String getDepatureTime(){
        return this.depatureTime;
    }

    public int checkAvailableSeats(){
        return plane.getPlaneCapacity() - passengers.size();
    }

    public void checkInPassenger(Passenger passenger){
        if(checkAvailableSeats() > 0){
            passengers.add(passenger);
        }
    }

}
