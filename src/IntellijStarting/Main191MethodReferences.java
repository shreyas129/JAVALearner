package IntellijStarting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld191 {
    private static int last_id = 1;
    private int id;

    public PlainOld191() {
        id = PlainOld191.last_id++;
        System.out.println("Creating a PlainOld object: id = " + id);
    }
}

public class Main191MethodReferences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Anna", "Bob", "Chuck" ,"Dave"));
        list.forEach(System.out::println);

        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 2.5, 7.5);

        Supplier<PlainOld191> reference1 = PlainOld191::new;
        PlainOld191 newPojo = reference1.get();
        System.out.println("Getting array");
        PlainOld191[] pojo1 = seedArray(PlainOld191::new, 10);

        calculator((s1, s2) -> s1.concat(s2), "Hello ", "World");
        calculator(String::concat, "Hello ", "World");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String, String, String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello ", "World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(u1.apply("Hello "));

        String result = "Hello".transform(u1);
        System.out.println("Result = " + result);

        result = result.transform(String::toLowerCase);
        System.out.println("Result = " + result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("Result = " + resultBoolean  );
    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        System.out.println("Result of operation: " + function.apply(value1, value2));
    }

    private static PlainOld191[] seedArray(Supplier<PlainOld191> reference, int count) {
        PlainOld191[] array = new PlainOld191[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}
