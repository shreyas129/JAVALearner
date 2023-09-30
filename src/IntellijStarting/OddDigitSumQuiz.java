package IntellijStarting;

public class OddDigitSumQuiz {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number >= 1) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                sum += lastDigit;
            }
            number /= 10;
        }

        return sum;

    }
}