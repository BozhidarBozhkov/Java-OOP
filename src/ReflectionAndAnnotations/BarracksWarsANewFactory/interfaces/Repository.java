package ReflectionAndAnnotations.BarracksWarsANewFactory.interfaces;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
