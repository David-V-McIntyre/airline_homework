import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {
    CabinCrewMember member1;
    CabinCrewMember member2;
    CabinCrewMember member3;

    @Before
    public void before(){
        member1 = new CabinCrewMember("Diana", CabinCrewRank.TeamLeader, EmployeeNo.YQ332987);
        member2 = new CabinCrewMember("Clark", CabinCrewRank.SeniorFlightAttendant, EmployeeNo.YO127743);
        member3 = new CabinCrewMember("Bruce", CabinCrewRank.FlightAttendant, EmployeeNo.TH546386);
    }

    @Test
    public void hasName(){
        assertEquals("Diana", member1.getName());
        assertEquals("Clark", member2.getName());
        assertEquals("Bruce", member3.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CabinCrewRank.TeamLeader, member1.getCabinCrewRank());
        assertEquals(CabinCrewRank.SeniorFlightAttendant, member2.getCabinCrewRank());
        assertEquals(CabinCrewRank.FlightAttendant, member3.getCabinCrewRank());
    }

    @Test
    public void hasEmployeeNo(){
        assertEquals(EmployeeNo.YQ332987, member1.getEmployeeNo());
        assertEquals(EmployeeNo.YO127743, member2.getEmployeeNo());
        assertEquals(EmployeeNo.TH546386, member3.getEmployeeNo());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Diana is relaying a message to the passengers", member1.relayMessage());
        assertEquals("Clark is relaying a message to the passengers", member2.relayMessage());
        assertEquals("Bruce is relaying a message to the passengers", member3.relayMessage());
    }

}
