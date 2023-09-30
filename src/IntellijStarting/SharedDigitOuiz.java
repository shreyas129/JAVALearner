package IntellijStarting;

public class SharedDigitOuiz {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(76, 68));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
      return (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99) && (number1 % 10 == number2 % 10 || number1 % 10 == number2 / 10 || number1 / 10 == number2 % 10 || number1 / 10 == number2 / 10);

    }

}
