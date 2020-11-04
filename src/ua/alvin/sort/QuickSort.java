package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
//O (n log n) mostly faster than mergeSort, in-line, unstable. In very rare worst-case scenario n^2.
    public static void main(String[] args) {
//        int[] array = createRandomArray(1000000);
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        evaluateAlgorithm(array, 0, array.length);
    }

    static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) return;

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    static int partition(int[] input, int start, int end) {

        int pivot = input[start];

        int i = start;
        int j = end;

        while (i < j) {

            //EMPTY LOOP BODY
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }
            //EMPTY LOOP BODY
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

    private static void evaluateAlgorithm(int[] arr, int start, int end) {

        long clockOn = System.currentTimeMillis();
        quickSort(arr, start, end);

      System.out.println(Arrays.toString(arr));
        long clockOff = System.currentTimeMillis();
        System.out.println("Sort time: " + (clockOff - clockOn) + " ms.");
    }


    private static int[] createRandomArray(int size) {
        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size - 1; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }
}
