package ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces;

public interface CommandInterpreter {

	@SuppressWarnings("unchecked")
	Executable interpretCommand(String[] data);

	Executable interpretCommand(String[] data, String commandName);
}
