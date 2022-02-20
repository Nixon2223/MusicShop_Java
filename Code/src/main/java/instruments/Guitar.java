package instruments;

public class Guitar extends Instrument{


    public Guitar(String type, String colour, String material, int buyPrice, int sellPrice) {
        super(type, colour, material, buyPrice, sellPrice);
    }

    public String play() {
        return "strum strum";
    }

    public int calculateMarkup() {
        return ((sellPrice - buyPrice) / buyPrice) * 100 ;
    }
}
