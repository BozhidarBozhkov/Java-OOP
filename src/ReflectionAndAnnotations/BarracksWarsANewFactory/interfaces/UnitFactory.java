package ReflectionAndAnnotations.BarracksWarsANewFactory.interfaces;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}