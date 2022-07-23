package ReflectionAndAnnotations.P05barrackWars.barracksWars;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.core.CommandInterpreterImpl;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Repository;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.UnitFactory;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.core.Engine;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.core.factories.UnitFactoryImpl;
import ReflectionAndAnnotations.P05barrackWars.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        final Repository repository = new UnitRepository();
        final UnitFactory unitFactory = new UnitFactoryImpl();
        final CommandInterpreterImpl commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);
        final Engine engine = new Engine(commandInterpreter);

        engine.run();
    }
}
