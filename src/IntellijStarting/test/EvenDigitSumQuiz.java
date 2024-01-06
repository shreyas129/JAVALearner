package IntellijStarting.test;

public class EvenDigitSumQuiz {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(42));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number >=2) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }

        return sum;

    }
}