package instruments;

import behaviors.IPlay;
import behaviors.ISell;

public abstract class Instrument implements ISell, IPlay {

    private String type;
    private String colour;
    private String material;
    private String buyPrice;
    private String sellPrice;

    public Instrument(String type, String colour, String material, String buyPrice, String sellPrice) {
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
