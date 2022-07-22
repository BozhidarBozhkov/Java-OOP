package ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
