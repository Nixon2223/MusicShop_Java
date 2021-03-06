import behaviors.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addStock(ISell item){
        stock.add(item);
    }

    public void removeStock(ISell item){
        stock.remove(item);
    }

    public int countStock(){
        return stock.size();
    }

    public double totalPotentialProfit(){
        int result = 0;
        for (ISell item: stock){
            result += item.calculateMarkup();
        }
        return result;
    }
}
