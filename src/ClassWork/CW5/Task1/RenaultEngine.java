package ClassWork.CW5.Task1;

public class RenaultEngine extends Engine {
    private double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    @Override
    protected double efficiency() {
        return 0.27d;
    }

    @Override
    protected double throttleEnergy() {
        return engineVolume * cylinderAmount * 110d + extraTurboEnergy;
    }

    @Override
    protected double breakEnergy() {
        return engineWeight * 2.1d;
    }
}