package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;
/*in-place unstable sort, faster than bubble sort but still O(n^2)*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = createRandomArray(10000);
        evaluateAlgorithm(array);
    }

    private static void evaluateAlgorithm(int [] arr){
        long begin = System.currentTimeMillis();
        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
        long end = System.currentTimeMillis();
        System.out.println("Sort time: " + (end - begin) + " ms.");
    }

    private static void selectionSort(int[] array) {

        for (int lasUnsortedIndex = array.length - 1; lasUnsortedIndex > 0; lasUnsortedIndex--) {
            int indexOfLargest = 0;
            for (int i = 1; i <= lasUnsortedIndex; i++) {
                if (array[i] > array[indexOfLargest]) {
                    indexOfLargest = i;
                }
            }
            swap(array,indexOfLargest,lasUnsortedIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {

        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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


