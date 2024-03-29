package Encapsulation.Exercise.P04PizzaCalories;

import java.util.Arrays;

public class Topping {
    private ToppingEnum toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        boolean toppingExists = Arrays.stream(ToppingEnum.values()).anyMatch(t -> t.name().equals(toppingType));
        if (toppingExists) {
            this.toppingType = ToppingEnum.valueOf(toppingType);
        } else {
            String exceptionMessage = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(exceptionMessage);
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String exceptionMessage = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(exceptionMessage);
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * weight * getToppingModifier();
    }

    private double getToppingModifier() {
        return toppingType.getModifier();
    }
}
