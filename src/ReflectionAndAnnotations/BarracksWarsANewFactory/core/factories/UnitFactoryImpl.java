package ReflectionAndAnnotations.BarracksWarsANewFactory.core.factories;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Unit;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"ReflectionAndAnnotations.P05barrackWars.barracksWars.models.units.";

	@Override
	@SuppressWarnings("all")
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException,
			ClassNotFoundException,
			NoSuchMethodException,
			InvocationTargetException,
			InstantiationException,
			IllegalAccessException {

		final Class<Unit> unitClass = (Class<Unit>) Class.forName(UNITS_PACKAGE_NAME + unitType);

		return createUnit(unitClass);

		//throw new ExecutionControl.NotImplementedException("message");
	}

	private Unit createUnit(Class<Unit> unitClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		final Constructor<Unit> constructorOfUnit = unitClass.getDeclaredConstructor();
		constructorOfUnit.setAccessible(true);

		return constructorOfUnit.newInstance();
	}
}
