package ReflectionAndAnnotations.Lab;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class reflection = Reflection.class;

        System.out.println(reflection.toString());

        Class superClass = reflection.getSuperclass();
        System.out.println(superClass);

        Class[] interfaces = reflection.getInterfaces();

        for (Class c : interfaces) {
            System.out.println(c);
        }

        Constructor constructor = reflection.getDeclaredConstructor();

        Object newInstance = constructor.newInstance();

        System.out.println(newInstance);
    }

}
