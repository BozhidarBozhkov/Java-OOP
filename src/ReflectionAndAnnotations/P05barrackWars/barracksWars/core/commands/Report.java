package ReflectionAndAnnotations.P05barrackWars.barracksWars.core.commands;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.annotations.Inject;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Repository;

public class Report extends Command{

    @Inject
    private Repository repository;

    public Report(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }

}
