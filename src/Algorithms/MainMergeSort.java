package Algorithms;

import java.util.Arrays;

public class MainMergeSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,6,7,8,9,1,2,3,10};
        mergeSort(arr, 0, arr.length);
        System.out.println("The final answer is = " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int startIndex, int endIndex) {
        endIndex -= 1;
        if (endIndex - startIndex > 1) {
            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(arr, startIndex, middleIndex);
            mergeSort(arr, middleIndex + 1, endIndex);
            for (int i = middleIndex + 1; i <= endIndex; i++) {
                for (int j = startIndex; j <= middleIndex; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                    System.out.println("----> " + Arrays.toString(arr));
                }
                System.out.println("--> " + Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-".repeat(endIndex * 2));
    }
}
