package HomeWork.HW5.Task1;

import java.util.ArrayList;

public class KFC implements Restaurant {

    private ArrayList<Integer> _basketPrices;

    public KFC(){
        _basketPrices = new ArrayList<>(100);
    }

    public void addBasket(int basketPrice){
        _basketPrices.add(basketPrice);
    }

    @Override
    public double getTotalIncome() {
        return _basketPrices
                .stream()
                .reduce(Integer::sum)
                .get();
    }

    @Override
    public double getTotalOutcome() {
        return 0;
    }
}
