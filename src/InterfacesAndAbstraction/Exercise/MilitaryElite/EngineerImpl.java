package InterfacesAndAbstraction.Exercise.MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{

    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableCollection(repairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f%n", getFirstName(), getLastName(), getId(), getSalary()))
                .append(String.format("Corps: %s%n", getCorps()))
                .append("Repairs:");
        repairs.forEach(r -> {
            sb.append(String.format("%n %s", r));
        });

        return sb.toString();

    }
}
