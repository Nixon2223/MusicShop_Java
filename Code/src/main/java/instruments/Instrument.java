package instruments;

import behaviors.IPlay;
import behaviors.ISell;

public abstract class Instrument implements ISell, IPlay {

    protected String type;
    protected String colour;
    protected String material;
    protected double buyPrice;
    protected double sellPrice;

    public Instrument(String type, String colour, String material, double buyPrice, double sellPrice) {
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return ((sellPrice - buyPrice) / buyPrice) * 100 ;
    }
}
