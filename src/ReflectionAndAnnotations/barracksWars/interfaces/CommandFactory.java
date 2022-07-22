package ReflectionAndAnnotations.barracksWars.interfaces;

//import barracksWars.core.commands.Command;

import ReflectionAndAnnotations.barracksWars.core.commands.Command;

import java.lang.reflect.InvocationTargetException;

public interface CommandFactory {
    Command createCommand(String commandName, String[] data) throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException;
}
