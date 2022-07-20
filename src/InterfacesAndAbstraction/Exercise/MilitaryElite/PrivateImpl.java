package InterfacesAndAbstraction.Exercise.MilitaryElite;

public class PrivateImpl extends SoldierImpl implements Private {

    public double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        //Name: {firstName} {lastName} Id: {id} Salary: {salary}
        return String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), salary);
    }
}
