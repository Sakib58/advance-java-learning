package dp.observer_07;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double currentPrice;
    private List<PriceObserver> priceObserverList;

    public Product(String productName, double currentPrice) {
        this.productName = productName;
        this.currentPrice = currentPrice;
        priceObserverList = new ArrayList<>();
    }

    public void addObserver(PriceObserver observer) {
        priceObserverList.add(observer);
    }
    public List<PriceObserver> getAllObserver() {
        return priceObserverList;
    }
    private void notifyObserver() {
        for (PriceObserver observer : priceObserverList) {
            observer.onPriceDrop();
        }
    }
    public void setNewProductPrice(double newProductPrice) {
        double oldPrice = currentPrice;
        currentPrice = newProductPrice;
        if (currentPrice < oldPrice) {
            notifyObserver();
        }
    }
}
