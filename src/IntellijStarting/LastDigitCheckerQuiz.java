package IntellijStarting;

public class LastDigitCheckerQuiz {
    public static void main(String[] args) {

    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        return ( (number1 >= 10 && number1 <= 1000 && number2 >= 10 && number2 <= 1000 && number3 >= 10 && number3 <= 1000) && (number1 % 10 == number2 % 10 || number1 % 10 == number2 / 10 || number1 / 10 == number2 % 10 || number1 / 10 == number2 / 10 || number1 % 10 == number3 % 10 || number1 % 10 == number3 / 10 || number1 / 10 == number3 % 10 || number1 / 10 == number3 / 10 || number3 % 10 == number2 % 10 || number3 % 10 == number2 / 10) );
    }
}
