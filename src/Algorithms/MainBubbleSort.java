package Algorithms;

import java.util.Arrays;

public class MainBubbleSort {
    public static void main(String[] args) {
        int[] numSort = {25, 20, 15, 10, 5};

        for (int i = 0; i < numSort.length; i++) {
            System.out.println(Arrays.toString(numSort));
            for (int j = 0; j< numSort.length - (i + 1); j++) {
                if (numSort[j] > numSort[j + 1]) {
                    int temp = numSort[j];
                    numSort[j] = numSort[j + 1];
                    numSort[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numSort));
            System.out.println("-".repeat(10));
        }
        System.out.println("The answer is " + Arrays.toString(numSort));
    }
}
