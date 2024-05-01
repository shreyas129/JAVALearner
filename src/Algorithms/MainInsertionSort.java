package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MainInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of observation");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input next number");
            int inputNumber = scanner.nextInt();
            if (i == 0) {
                arr[0] = inputNumber;
            } else {
                int insertNumber = inputNumber;
                for (int j = 0; j < i; j++) {
                    if (arr[j] > insertNumber) {
                        int temp = arr[j];
                        arr[j] = insertNumber;
                        insertNumber = temp;
                    }
                }
                arr[i] = insertNumber;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("-".repeat(10));
        }
        System.out.println("The final answer is " + Arrays.toString(arr));
    }
}
