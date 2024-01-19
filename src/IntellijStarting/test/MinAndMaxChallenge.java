package IntellijStarting.test;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopcount = 0;

        while (true) {
            System.out.println("Enter a number,or any character to exit");
            String nextEntry = scanner.nextLine();
            try {
                double validnum = Double.parseDouble(nextEntry);
                if (loopcount == 0 || validnum < min) {
                    min = validnum;
                }
                if (loopcount == 0 || validnum > max) {
                    max = validnum;
                }
                loopcount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopcount > 0) {
            System.out.println("min = " + min + ", max = " + max);
           } else {
            System.out.println("No vailid data entered");
        }
    }
}
