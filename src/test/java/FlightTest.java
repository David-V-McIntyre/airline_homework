import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    CabinCrewMember member1;
    CabinCrewMember member2;
    CabinCrewMember member3;
    Passenger passenger1;
    Passenger passenger2;
    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;
    Pilot pilot4;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Flight flight1;
    Flight flight2;

    @Before
    public void before(){
        member1 = new CabinCrewMember("Diana", CabinCrewRank.TeamLeader, EmployeeNo.YQ332987);
        member2 = new CabinCrewMember("Clark", CabinCrewRank.SeniorFlightAttendant, EmployeeNo.YO127743);
        member3 = new CabinCrewMember("Bruce", CabinCrewRank.FlightAttendant, EmployeeNo.TH546386);
        passenger1 = new Passenger("James", 2);
        passenger2 = new Passenger("Jesse", 3);
        pilot1 = new Pilot("Athos", PilotRank.Captain, EmployeeNo.AS109238);
        pilot2 = new Pilot("Porthos", PilotRank.FO, EmployeeNo.II877670);
        pilot3 = new Pilot("Aramis", PilotRank.SO, EmployeeNo.JN245648);
        pilot4 = new Pilot("d'Artagnan", PilotRank.Cadet, EmployeeNo.SS648092);
        plane1 = new Plane(PlaneType.Boeing737);
        plane2 = new Plane(PlaneType.Boeing747);
        plane3 = new Plane(PlaneType.BoeingSkimmer);

        flight1 = new Flight("19:00", "GLA", "STN", "EZ144", plane1, pilot1);
        flight2 = new Flight("09:00", "STN", "CZA", "BA223", plane3, pilot3);
    }

    @Test
    public void flightHasDeptTime() {
        assertEquals("19:00", flight1.getDeptTime());
        assertEquals("09:00", flight2.getDeptTime());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals("GLA", flight1.getDeparture());
        assertEquals("STN", flight2.getDeparture());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("STN", flight1.getDestination());
        assertEquals("CZA", flight2.getDestination());
    }

    @Test
    public void flightHasFlightNo(){
        assertEquals("EZ144", flight1.getFlightNo());
        assertEquals("BA223", flight2.getFlightNo());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane1, flight1.getPlane());
        assertEquals(plane3, flight2.getPlane());
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot1, flight1.getPilot());
        assertEquals(pilot3, flight2.getPilot());
    }

    @Test
    public void flightHasCrewMembers(){
        flight1.addCabinCrew(member1);
        flight1.addCabinCrew(member2);
        flight2.addCabinCrew(member3);
        assertEquals(2, flight1.getCabinCrewSize());
        assertEquals(1, flight2.getCabinCrewSize());
    }

    @Test
    public void flightHasPassengers(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight2.bookPassenger(passenger1);
        assertEquals(2, flight1.getPassengersSize());
        assertEquals(1, flight2.getPassengersSize());
    }

    @Test
    public void flightHasAvailableSeats(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight2.bookPassenger(passenger1);
        assertEquals(98, flight1.availableSeats());
        assertEquals(2, flight2.availableSeats());
    }

    @Test
    public void flightHasNoAvailableSeats(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger2);
        assertEquals(0, flight2.availableSeats());
    }


}
