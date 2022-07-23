package ReflectionAndAnnotations.P05barrackWars.barracksWars.core.commands;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.interfaces.Executable;

public abstract class Command implements Executable {

   private final String[] data;

   protected Command(String[] data) {
       this.data = data;
   }

   protected String[] getData() {
       return this.data;
   }
}
