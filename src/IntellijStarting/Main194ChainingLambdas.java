package IntellijStarting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main194ChainingLambdas {
    public static void main(String[] args) {
        String name = "Shreyas";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Tathode");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String, String[]> f0 = uCase.andThen(s -> s.concat(" Tathode"))
                .andThen(s -> s.split(" ")
        );

        System.out.println(Arrays.toString(f0.apply(name)));


        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Tathode"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0])
        ;

        System.out.println(f1.apply(name));

        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Tathode"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length)
        ;

        System.out.println(f2.apply(name));
        String[] names = {"Ann", "Bob", "Carol"};
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;

        Arrays.asList(names).forEach(s0.andThen(s -> System.out.print(" - ")).andThen(s1));

        Predicate<String> p1 = s -> s.equals("SHREYAS");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("SHREYAS");
        Predicate<String> p3 = s -> s.startsWith("S");
        Predicate<String> p4 = s -> s.endsWith("S");

        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined1 = " + combined1.test(name));

        Predicate<String> combined2 = p3.and(p4);
        System.out.println("combined2 = " + combined2.test(name));

        Predicate<String> combined3 = p3.and(p4).negate();
        System.out.println("Combined3 = " + combined3.test(name));

        record Person195(String firstName, String lastName) {}

        List<Person195> list = new ArrayList<>(Arrays.asList(
                new Person195("Peter", "Pan"),
                new Person195("Peter", "PumpkinEater"),
                new Person195("Minnnie", "Mouse"),
                new Person195("Mickey", "Mouse")
        ));

        list.sort(((o1, o2) -> o1.lastName.compareTo(o2.lastName)));
        list.forEach(System.out::println);

        System.out.println("----------------------------");
        list.sort(Comparator.comparing(Person195::lastName));
        list.forEach(System.out::println);

        System.out.println("----------------------------");
        list.sort(Comparator.comparing(Person195::lastName)
                        .thenComparing(Person195::firstName));
        list.forEach(System.out::println);

        System.out.println("----------------------------");
        list.sort(Comparator.comparing(Person195::lastName)
                        .thenComparing(Person195::firstName).reversed());
        list.forEach(System.out::println);
    }
}
