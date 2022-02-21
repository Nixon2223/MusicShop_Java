package instruments;

import behaviors.IPlay;
import behaviors.ISell;

public abstract class Instrument implements ISell, IPlay {

    protected String type;
    protected String colour;
    protected String material;
    protected double buyPrice;
    protected double sellPrice;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

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
