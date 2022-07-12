package InterfacesAndAbstraction.Exercise.P04FoodShortage;

public class Rebel implements Person ,Buyer {

    private String name;
    private int age;
    private String group;
    private int food;

    public String getGroup() {
        return group;
    }

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Rebel(String name) {
        this.name = name;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
