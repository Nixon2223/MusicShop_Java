import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("String","red","ash",50.00,75.00, 6);
        piano = new Piano("percussion", "black", "maple", 250.00, 350.00, 125);
    }
}
