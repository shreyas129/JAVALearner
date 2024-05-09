package Algorithms;

public class testingFile {
    public static void main(String[] args) {
        print(5, 1);
    }

    public static void print(int i, int counterUsuallyTypeOne ) {
        if (counterUsuallyTypeOne < 11) {
            System.out.println(i * counterUsuallyTypeOne);
            print(i, counterUsuallyTypeOne + 1);
        }
    }
}
