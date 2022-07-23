package ReflectionAndAnnotations.P05barrackWars.barracksWars.core.commands;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.annotations.Inject;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Repository;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Unit;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Add extends Command{

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    public Add(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, ExecutionControl.NotImplementedException {

        final String unitType = getData()[1];
        final Unit unitToAdd = this.unitFactory.createUnit(unitType);
        this.repository.addUnit(unitToAdd);

        return unitType + " added!";
    }
}
