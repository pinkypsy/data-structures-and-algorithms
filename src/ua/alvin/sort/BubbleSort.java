package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

/*in-place stable sort, not fast O(n^2)*/
public class BubbleSort {

    public static void main(String[] args) {


//        int [] array = new int[] {5,1,7,2,8};
        int[] array = createRandomArray(10000);
        evaluateAlgorithm(array);
    }

    private static void evaluateAlgorithm(int[] arr) {
        long begin = System.currentTimeMillis();
//        oldSort(array);
        newSort(arr); //40% faster
        System.out.println(Arrays.toString(arr));
        long end = System.currentTimeMillis();
        System.out.println("Sort time: " + (end - begin) + " ms.");
    }

    private static int[] createRandomArray(int size) {
        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size - 1; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    private static void oldSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    private static void newSort(int[] array) {

        for (int lasUnsortedIndex = array.length - 1; lasUnsortedIndex > 0; lasUnsortedIndex--) {

            for (int i = 0; i < lasUnsortedIndex; i++) {

                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {

        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
