package ReflectionAndAnnotations.Lab.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Field[] fields = clazz.getDeclaredFields();

        


    }

    public static <T extends Member> TreeSet<T> filterMembersBy (T[] members, String filter) {

        return Arrays.stream(members)
                .filter(m -> m.getName().contains(filter))
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(Member::getName))));
    }

}
