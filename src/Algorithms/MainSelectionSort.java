package Algorithms;

import java.util.Arrays;

public class MainSelectionSort {
    public static void main(String[] args) {
        int[] numSort = {25, 20, 15, 10, 5};

        for (int i = 0; i < numSort.length; i++) {
            System.out.println(Arrays.toString(numSort));
            for (int j = i; j < numSort.length; j++) {
                int temp = numSort[i];
                numSort[i] = numSort[j];
                numSort[j] = temp;
            }
            System.out.println(Arrays.toString(numSort));
            System.out.println("-".repeat(10));
        }
        System.out.println("the answer is " + Arrays.toString(numSort));
    }
}
