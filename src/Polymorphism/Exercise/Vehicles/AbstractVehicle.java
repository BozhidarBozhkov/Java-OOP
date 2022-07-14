package Polymorphism.Exercise.Vehicles;

import java.text.DecimalFormat;

public abstract class AbstractVehicle implements Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private DecimalFormat df = new DecimalFormat(".##");

    public AbstractVehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    protected boolean hasEnoughFuel(double kilometers) {
        double totalFuelCost = kilometers * getFuelConsumption();
        return totalFuelCost < getFuelQuantity();
    }

    protected void consumedFuel(double kilometers) {
        fuelQuantity -= kilometers * fuelConsumption;
    }

    @Override
    public String drive(double kilometers) {
        if (!hasEnoughFuel(kilometers)) {
            return " needs refueling";
        }
        consumedFuel(kilometers);
        return " travelled " + df.format(kilometers) + " km";
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }
    @Override
    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
