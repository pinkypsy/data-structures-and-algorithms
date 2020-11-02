package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

/*in-place stable sort, faster than selection sort but still O(n^2)*/
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = createRandomArray(10000);
        evaluateAlgorithm(array);
    }

    private static void evaluateAlgorithm(int[] arr) {
        long begin = System.currentTimeMillis();
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        long end = System.currentTimeMillis();
        System.out.println("Sort time: " + (end - begin) + " ms.");
    }

    private static void insertionSort(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
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
