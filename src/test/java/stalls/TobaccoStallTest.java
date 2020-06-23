package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import sun.jvm.hotspot.runtime.StaticBaseConstructor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canCheckIfAllowedToVisitor__true() {
        Visitor visitor = new Visitor(25, 1.7, 100);
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIfAllowedToVisitor__false() {
        Visitor visitor = new Visitor(14, 1.2, 40);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }
}
