package IntellijStarting.test;

public class LastDigitCheckerQuiz {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 21, 15));
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
                return isValid(number1) && isValid(number2) && isValid(number3) && (number1 % 10 == number2 % 10 || number2 % 10 == number3 % 10 || number1 % 10 == number3 % 10);
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000 );
    }
}
