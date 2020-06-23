package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canCheckIfAllowedToVisitor__true() {
        Visitor visitor = new Visitor(14, 1.2, 40.0);
        assertTrue(playground.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIfAllowedToVisitor__false() {
        Visitor visitor = new Visitor(25, 1.7, 100.0);
        assertFalse(playground.isAllowedTo(visitor));
    }
}
