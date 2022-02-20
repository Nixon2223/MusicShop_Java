package instruments;

public class Guitar extends Instrument{

    private int numStrings;

    public Guitar(String type, String colour, String material, double buyPrice, double sellPrice, int numStrings ) {
        super(type, colour, material, buyPrice, sellPrice);
        this.numStrings = numStrings;
    }

    public String play() {
        return "strum, strum";
    }
}
