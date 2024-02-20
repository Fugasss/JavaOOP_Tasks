package ClassWork.CW5.Task1;

public class FerrariEngine extends Engine {
    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    protected double efficiency() {
        return 0.25d;
    }

    @Override
    protected double throttleEnergy() {
        return engineVolume * cylinderAmount * 100d;
    }

    @Override
    protected double breakEnergy() {
        return engineWeight * 2d;
    }
}