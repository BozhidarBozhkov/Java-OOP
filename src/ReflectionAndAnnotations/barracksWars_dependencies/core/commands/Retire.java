package ReflectionAndAnnotations.barracksWars_dependencies.core.commands;

import barracksWars.annotations.Inject;
import barracksWars.core.commands.Command;
import barracksWars.interfaces.Repository;

public class Retire extends Command {

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
