import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;
    Pilot pilot4;

    @Before
    public void before(){
        pilot1 = new Pilot("Athos", PilotRank.Captain, EmployeeNo.AS109238);
        pilot2 = new Pilot("Porthos", PilotRank.FO, EmployeeNo.II877670);
        pilot3 = new Pilot("Aramis", PilotRank.SO, EmployeeNo.JN245648);
        pilot4 = new Pilot("d'Artagnan", PilotRank.Cadet, EmployeeNo.SS648092);
    }

    @Test
    public void hasName(){
        assertEquals("Athos", pilot1.getName());
        assertEquals("Porthos", pilot2.getName());
        assertEquals("Aramis", pilot3.getName());
        assertEquals("d'Artagnan", pilot4.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(PilotRank.Captain, pilot1.getPilotRank());
        assertEquals(PilotRank.FO, pilot2.getPilotRank());
        assertEquals(PilotRank.SO, pilot3.getPilotRank());
        assertEquals(PilotRank.Cadet, pilot4.getPilotRank());
    }

    @Test
    public void hasEmployeeNo(){
        assertEquals(EmployeeNo.AS109238, pilot1.getEmployeeNo());
        assertEquals(EmployeeNo.II877670, pilot2.getEmployeeNo());
        assertEquals(EmployeeNo.JN245648, pilot3.getEmployeeNo());
        assertEquals(EmployeeNo.SS648092, pilot4.getEmployeeNo());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Athos is flying the plane", pilot1.flyPlane());
        assertEquals("Porthos is flying the plane", pilot2.flyPlane());
        assertEquals("Aramis is flying the plane", pilot3.flyPlane());
        assertEquals("d'Artagnan is flying the plane", pilot4.flyPlane());
    }


}
