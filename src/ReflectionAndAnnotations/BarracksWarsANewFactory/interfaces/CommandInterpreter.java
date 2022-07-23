package ReflectionAndAnnotations.BarracksWarsANewFactory.interfaces;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
