package IntellijStarting;

import java.time.LocalDate;

public class Main96StringMultiLine {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022First point \n" +
                "\t\t\u2022Second point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted list:
                            \u2022First point
                                \u2022Sub point""";

        System.out.println(textBlock);

        int age = 9;
        System.out.printf("Your age is %d%n", age);

        int currentYear = LocalDate.now().getYear();
        int yearOfBirth = currentYear - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %4.2f%n", (float) age);

        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
