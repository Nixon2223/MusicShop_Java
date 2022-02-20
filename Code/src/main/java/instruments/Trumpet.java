package instruments;

public class Trumpet extends Instrument{

    public Trumpet(String type, String colour, String material, double buyPrice, double sellPrice) {
        super(type, colour, material, buyPrice, sellPrice);
    }

    public String play() {
        return "trumpet sounds";
    }
}
