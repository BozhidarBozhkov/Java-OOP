package ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.core.commands;

import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Executable;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

   private final String[] data;
   private final Repository repository;
   private final UnitFactory unitFactory;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return this.data;
    }

    public Repository getRepository() {
        return this.repository;
    }

    public UnitFactory getUnitFactory() {
        return this.unitFactory;
    }


}
