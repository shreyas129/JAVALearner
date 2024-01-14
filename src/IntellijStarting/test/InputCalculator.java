package IntellijStarting.test;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average;
        int count = 0;

        while (true) {
            String nextEntry = scanner.nextLine();
            try {
                sum += Integer.parseInt(nextEntry);
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (sum == 0) {
            System.out.printf("SUM = %d AVG = %d", 0, 0);
        } else {
            System.out.printf("SUM = %d AVG = %d", sum, sum / count);
        }
    }
}
