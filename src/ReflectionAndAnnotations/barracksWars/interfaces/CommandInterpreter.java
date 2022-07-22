package ReflectionAndAnnotations.barracksWars.interfaces;

import barracksWars.interfaces.Executable;

public interface CommandInterpreter {

	@SuppressWarnings("unchecked")
    barracksWars.interfaces.Executable interpretCommand(String[] data);

	Executable interpretCommand(String[] data, String commandName);
}
