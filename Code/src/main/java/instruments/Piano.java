package instruments;

public class Piano extends Instrument{

    private int numKeys;

    public Piano(String type, String colour, String material, int buyPrice, int sellPrice, int numKeys ) {
        super(type, colour, material, buyPrice, sellPrice);
        this.numKeys = numKeys;
    }

    public String play() {
        return "piano sounds";
    }

}