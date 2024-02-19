package HomeWork.HW5.Task2;


public class Veteran extends Person {

    public Veteran(String name, int age, int exp) {
        super(name, age, exp);
    }

    @Override
    public boolean Shoot() {
        double value = generateRandomValue();
        double chance = .9d - .01d * _age;
        return value < chance;
    }
}
