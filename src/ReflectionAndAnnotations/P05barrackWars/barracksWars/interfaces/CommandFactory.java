package ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.core.commands.Command;

import java.lang.reflect.InvocationTargetException;

public interface CommandFactory {
    Command createCommand(String commandName, String[] data) throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException;
}
