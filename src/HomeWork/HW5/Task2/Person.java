package HomeWork.HW5.Task2;

import java.util.Random;
import java.lang.Math;

public abstract class Person {
    protected String _name;
    protected int _age;
    protected int _experience;

    public Person(String name, int age, int exp) {
        _name = name;
        _age = age;
        _experience = exp;
    }

    protected double generateRandomValue() {
        return (double) Math.abs(new Random().nextInt()) / Integer.MAX_VALUE;
    }

    public String getName() {
        return _name;
    }

    public int getExperience() {
        return _experience;
    }

    public int getAge() {
        return _age;
    }

    public abstract boolean Shoot();

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d\nExperience: %d\n", _name, _age, _experience);
    }
}