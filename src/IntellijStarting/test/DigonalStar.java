package IntellijStarting.test;

public class DigonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 1; i <= number; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j < number - 1; j++) {
                System.out.print("*");
                for (int z = 1; z < number -1; z++) {
                    if (z == j) {
                        System.out.print("*");
                    } else if (j + z == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
            System.out.print("*");
            for (int x = 1; x < number; x++) {
                System.out.print("*");
            }
        }
    }
}
