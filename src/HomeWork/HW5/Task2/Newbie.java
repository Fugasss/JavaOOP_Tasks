package HomeWork.HW5.Task2;


public class Newbie extends Person {

    public Newbie(String name, int age, int exp) {
        super(name, age, exp);
    }

    @Override
    public boolean Shoot() {
        double value = generateRandomValue();
        double chance =  .01d * _experience;
        return value < chance;
    }
}
