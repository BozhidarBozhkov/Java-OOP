package Inheritance.Exercise.P06Animals;

public class Tomcat extends Animal{
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    public String produceSound() {
         return "MEOW";
    }
}
