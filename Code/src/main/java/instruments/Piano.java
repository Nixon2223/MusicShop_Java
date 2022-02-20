package instruments;

public class Piano extends Instrument{

    private int numKeys;

    public Piano(String type, String colour, String material, double buyPrice, double sellPrice, int numKeys ) {
        super(type, colour, material, buyPrice, sellPrice);
        this.numKeys = numKeys;
    }

    public String play() {
        return "piano sounds";
    }

}