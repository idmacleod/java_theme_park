import attractions.Attraction;
import attractions.Park;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    private RollerCoaster rollerCoaster;
    private Park park;
    private ArrayList<Attraction> attractions;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private ArrayList<Stall> stalls;
    private ThemePark themePark;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        park = new Park("Leafy Meadows", 9);
        attractions = new ArrayList<Attraction>();
        Collections.addAll(attractions, rollerCoaster, park);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 5);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        stalls = new ArrayList<Stall>();
        Collections.addAll(stalls, iceCreamStall, tobaccoStall);
        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void hasAttractions() {
        assertEquals(attractions, themePark.getAttractions());
    }

    @Test
    public void hasStalls() {
        assertEquals(stalls, themePark.getStalls());
    }
}
