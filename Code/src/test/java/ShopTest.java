import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void canReturnStockMarkup(){
        assertEquals(25.00, guitar.calculateMarkup(), 0.00);
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.countStock());
        shop.removeStock(guitar);
        assertEquals(0, shop.countStock());
    }
}
