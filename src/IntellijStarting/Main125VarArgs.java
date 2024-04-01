package IntellijStarting;

public class Main125VarArgs {
    public static void main(String... args) {
        System.out.println("Hello World Again");
        String[] splitsString = "Hello World again".split(" ");
        printText(splitsString);

        System.out.println("-".repeat(20));
        printText("Hello");

        System.out.println("-".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("-".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
