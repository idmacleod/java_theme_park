package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canCheckIfAllowedToVisitor__true() {
        Visitor visitor = new Visitor(25, 1.7, 100.0);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIfAllowedToVisitor__tooYoung() {
        Visitor visitor = new Visitor(11, 1.5, 50.0);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIfAllowedToVisitor__tooShort() {
        Visitor visitor = new Visitor(90, 1.2, 60.0);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }
}
