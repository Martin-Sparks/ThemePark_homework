package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor = new Visitor(25, 2.90, 90);

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
    public void canEnter(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void getPrice(){
        assertEquals(8.40, rollerCoaster.getPrice(), 0.00);
    }

    @Test
    public void setPrice(){
        rollerCoaster.setPrice(visitor);
        assertEquals(8.40, rollerCoaster.getPrice(),0.01);
    }

    @Test
    public void doublePrice(){
        rollerCoaster.getPrice();
        rollerCoaster.priceFor(visitor);
        assertEquals(16.80, rollerCoaster.getPrice(), 0.01);
    }


}
