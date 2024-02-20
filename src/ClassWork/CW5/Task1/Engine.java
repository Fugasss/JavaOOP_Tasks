package ClassWork.CW5.Task1;

public abstract class Engine {
    protected double engineVolume;
    protected int cylinderAmount;
    protected double engineWeight;

    public Engine() {
    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    protected abstract double efficiency();

    protected abstract double throttleEnergy();

    protected abstract double breakEnergy();

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public double getMaxSpeed() {
        return (throttleEnergy() - breakEnergy()) * efficiency();
    }
}