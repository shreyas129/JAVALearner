package IntellijStarting;

public class FirstLastDigitSumQuiz {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number > 9) {
            number /= 10;
        }

        return number + lastDigit;
    }
}