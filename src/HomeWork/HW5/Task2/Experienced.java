package HomeWork.HW5.Task2;


public class Experienced extends Person {

    public Experienced(String name, int age, int exp) {
        super(name, age, exp);
    }

    @Override
    public boolean Shoot() {
        double value = generateRandomValue();
        double chance = .05d * _experience;
        return value < chance;
    }
}
