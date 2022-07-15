package Polymorphism.Exercise.Vehicles;

public class Truck extends Vehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double REFUEL_MAX_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        liters = liters * REFUEL_MAX_PERCENTAGE;
        super.refuel(liters);
    }
}

