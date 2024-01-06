package IntellijStarting.test;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(10));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return(-1);
        }
        else {
            int largestPrime = 1;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    boolean isPrime = true;
                    for (int divisorOfDivisor = 2; divisorOfDivisor < divisor; divisorOfDivisor++) {
                        if (divisor % divisorOfDivisor == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        largestPrime = divisor;
                    }
                }
            }
            if (largestPrime == 1) {
                return (number);
            }
            return largestPrime;
        }
    }
}
