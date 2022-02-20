package instruments;

public class Trumpet extends Instrument{

    public Trumpet(String type, String colour, String material, int buyPrice, int sellPrice) {
        super(type, colour, material, buyPrice, sellPrice);
    }

    public String play() {
        return "trumpet sounds";
    }
}
