package HomeWork.HW5.Task1;

import java.util.ArrayList;

public class MCDonalds implements Restaurant {

    private ArrayList<Integer> _burgersPrices;

    private ArrayList<Integer> _workersSalary;


    public MCDonalds(){
        _burgersPrices = new ArrayList<>(100);
        _workersSalary = new ArrayList<>(20);
    }

    public void addBurger(int burgerPrice){
        _burgersPrices.add(burgerPrice);
    }

    public void addWorker(int workerSalary){
        _workersSalary.add(workerSalary);
    }

    @Override
    public double getTotalIncome() {
        return _burgersPrices
                .stream()
                .reduce(Integer::sum)
                .get();
    }

    @Override
    public double getTotalOutcome() {
        return _workersSalary
                .stream()
                .reduce(Integer::sum)
                .get();
    }
}
