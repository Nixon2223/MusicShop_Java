package instruments;

import behaviors.IPlay;
import behaviors.ISell;

public abstract class Instrument implements ISell, IPlay {

    protected String type;
    protected String colour;
    protected String material;
    protected int buyPrice;
    protected int sellPrice;

    public Instrument(String type, String colour, String material, int buyPrice, int sellPrice) {
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return ((sellPrice - buyPrice) / buyPrice) * 100 ;
    }
}
