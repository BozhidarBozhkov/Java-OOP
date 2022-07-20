package InterfacesAndAbstraction.Exercise.MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandoImpl extends  SpecialisedSoldierImpl implements Commando{

    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps, List<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        missions = new ArrayList<>();
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(missions);
    }
}
