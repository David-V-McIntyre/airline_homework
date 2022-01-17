import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane1;
    Plane plane2;
    Plane plane3;


    @Before
    public void setUp() {
        plane1 = new Plane(PlaneType.Boeing737);
        plane2 = new Plane(PlaneType.Boeing747);
        plane3 = new Plane(PlaneType.BoeingSkimmer);
    }

    @Test
    public void hasPlaneType737() {
        assertEquals(PlaneType.Boeing737, plane1.getPlaneType());
    }

    @Test
    public void hasPlaneType747() {
        assertEquals(PlaneType.Boeing747, plane2.getPlaneType());
    }

    @Test
    public void hasPlaneTypeSkimmer() {
        assertEquals(PlaneType.BoeingSkimmer, plane3.getPlaneType());
    }

    @Test
    public void canGetPlaneType737Capacity() {
        assertEquals(100, plane1.getCapacity());
    }

    @Test
    public void canGetPlaneType747Capacity() {
        assertEquals(200, plane2.getCapacity());
    }

    @Test
    public void canGetPlaneTypeSkimmerCapacity() {
        assertEquals(3, plane3.getCapacity());
    }

    @Test
    public void canGetPlaneType737Weight() {
        assertEquals(2000, plane1.getWeight());
    }

    @Test
    public void canGetPlaneType747Weight() {
        assertEquals(3000, plane2.getWeight());
    }

    @Test
    public void canGetPlaneTypeSkimmerWeight() {
        assertEquals(500, plane3.getWeight());
    }

}
