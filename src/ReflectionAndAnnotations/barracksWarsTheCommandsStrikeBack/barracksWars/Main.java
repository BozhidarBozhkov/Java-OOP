package ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars;

import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.core.Engine;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.core.factories.UnitFactoryImpl;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.data.UnitRepository;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Runnable;
import ReflectionAndAnnotations.barracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
