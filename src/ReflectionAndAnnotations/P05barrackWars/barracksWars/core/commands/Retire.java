package ReflectionAndAnnotations.P05barrackWars.barracksWars.core.commands;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.annotations.Inject;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Repository;

public class Retire extends Command{

    @Inject
    private Repository repository;

    public Retire(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try {
            this.repository.removeUnit(this.getData()[1]);
        } catch (Exception e) {
            return e.getMessage();
        }
        return this.getData()[1] + " retired!";
    }

}
