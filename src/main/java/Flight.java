import java.util.ArrayList;

public class Flight {
    private String deptTime;
    private String departure;
    private String destination;
    private String flightNo;
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrew;
    private Pilot pilot;

    public Flight(String deptTime, String departure, String destination, String flightNo, Plane plane, Pilot pilot){
        this.deptTime = deptTime;
        this.departure = departure;
        this.destination = destination;
        this.flightNo = flightNo;
        this.plane = plane;
        this.pilot = pilot;
        this.passengers = new ArrayList<Passenger>();
        this.cabinCrew = new ArrayList<CabinCrewMember>();
    }

    public void addCabinCrew(CabinCrewMember _crewMember) {
        cabinCrew.add(_crewMember);
    }

    public String bookPassenger(Passenger _passenger) {
        if (this.availableSeats() > 0) {
            passengers.add(_passenger);
        }
        else {
            System.out.println("cannot book, plane is at capacity");
        }
        return null;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public int getCabinCrewSize(){
        return cabinCrew.size();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getPassengersSize(){
        return this.passengers.size();
    }

    public int availableSeats(){
        return (this.plane.getCapacity() - this.getPassengersSize());
    }
}