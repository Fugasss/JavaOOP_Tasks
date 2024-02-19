package HomeWork.HW5.Task1;

import java.util.ArrayList;
import java.util.Optional;

public class City {
    private ArrayList<Restaurant> _restaurants;

    private String _cityName;

    public City() {
        _restaurants = new ArrayList<>(50);
        _cityName = "Undefined";
    }

    public City(String cityName) {
        this();
        _cityName = cityName;
    }

    public String getCityName() {
        return _cityName;
    }

    public void addRestaurant(Restaurant restaurant) {
        _restaurants.add(restaurant);
    }

    public double getTotalTax() {
        Optional<Double> total = _restaurants
                .stream()
                .map(x -> (x.getTotalIncome() - x.getTotalOutcome()))
                .reduce(Double::sum);

        return total.get() * .15d;

    }
}
