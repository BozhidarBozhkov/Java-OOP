package Encapsulation.Exercise.P04PizzaCalories;

public enum ToppingEnum {

    Meat (1.2),
    Veggies (0.8),
    Cheese (1.1),
    Sauce (0.9);

    private double modifier;

    public double getModifier() {
        return modifier;
    }

    ToppingEnum(double modifier) {
        this.modifier = modifier;
    }
}
