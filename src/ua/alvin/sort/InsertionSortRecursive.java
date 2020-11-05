package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortRecursive {

    public static void main(String[] args) {
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
//        int[] array = createRandomArray(10000);
        evaluateAlgorithm(array);
    }

    private static void evaluateAlgorithm(int[] arr) {
        long begin = System.currentTimeMillis();
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        long end = System.currentTimeMillis();
        System.out.println("Sort time: " + (end - begin) + " ms.");
    }

    private static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) return;

        insertionSort(input, numItems - 1);

        int newElem = input[numItems - 1];

        int i;

        for (i = numItems-1; i > 0 && input[i - 1] > newElem; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElem;
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
