package ReflectionAndAnnotations.barracksWars.core.commands;

//import barracksWars.core.commands.Command;

public class Fight extends Command {

    public Fight(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
