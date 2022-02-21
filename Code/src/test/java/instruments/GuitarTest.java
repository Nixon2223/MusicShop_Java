package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("String","red","ash",50.00,75.00, 6);
    }

    @Test
    public void hasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("strum, strum", guitar.play());
    }
}
