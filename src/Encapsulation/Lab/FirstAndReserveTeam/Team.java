package Encapsulation.Lab.FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    List<Person> firstTeam;
    List<Person> reverseTeam;

    public Team(String name) {
        this.name = name;
        firstTeam = new ArrayList<>();
        reverseTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reverseTeam.add(person);
        }
    }
    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reverseTeam);
    }
}
