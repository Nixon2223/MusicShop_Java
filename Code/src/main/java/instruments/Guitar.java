package instruments;

public class Guitar extends Instrument{


    public Guitar(String type, String colour, String material, String buyPrice, String sellPrice) {
        super(type, colour, material, buyPrice, sellPrice);
    }

    public String play() {
        return null;
    }
    
    public int calculateMarkup() {
        return 0;
    }
}
