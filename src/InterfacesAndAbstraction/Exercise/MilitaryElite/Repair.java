package InterfacesAndAbstraction.Exercise.MilitaryElite;

public class Repair {

    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
    //"Part Name: {partName} Hours Worked: {hoursWorked}"
        return String.format("Part Name: %s Hours Worked: %d", getPartName(), hoursWorked);

    }
}
