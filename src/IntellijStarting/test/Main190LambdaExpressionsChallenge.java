package IntellijStarting.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main190LambdaExpressionsChallenge {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carol", "David", "Ed", "Fred", "Gary"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("--> Transform to Uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println("--> Add random initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("--> Add reversed name as last name");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        System.out.println(newList);
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt(startChar,  (int) endChar + 1);
    }

    private static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }
}
