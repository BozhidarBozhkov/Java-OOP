package ReflectionAndAnnotations.BarracksWarsANewFactory.interfaces;

import barracksWars.interfaces.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
