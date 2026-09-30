package exceptionjava;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<Object> c = new ArrayList<>();

        c.add("Baddext");
        c.add("Pacifique");
        c.add(2);

        for (Object obj : c) {
            System.out.println("Values: " + obj);
        }

        Box<String> stringValue = new Box<>("Pacifique");

        System.out.println("Value: " + stringValue.value);

        main2(args);
    }

    static class Box<T> {
        T value;

        Box(T value) {
            this.value = value;
        }
    }

    public static void main2(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Baddext");
        names.add("Pacifique");

        List<String> result = displayValues(names);

        System.out.println("Value: " + result);
    }

    public static <T> List<T> displayValues(List<T> value) {
        return value;
    }
}