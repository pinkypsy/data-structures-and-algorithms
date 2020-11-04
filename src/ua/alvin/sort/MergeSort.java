package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

/*recursive, out of line, stable O(n log n) */
public class MergeSort {

    public static void main(String[] args) {
//        int[] array = createRandomArray(1000000);
        int[] array = new int[]{20, 35, -15, 7, 55, 1,-22};
        evaluateAlgorithm(array, 0, array.length);
    }

    private static void mergeSort(int[] input, int start, int end) {
        if ((end - start) < 2) return;

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }
//    int[] array = new int[]{20, 35, -15, 7, 55, 1,-22};
    private static void merge(int[] input, int start, int mid, int end) {
//        if (input[mid - 1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while (i < mid && j < end) {
//            System.out.print(input[i] + " " + input[j] + " ");
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    private static void evaluateAlgorithm(int[] arr, int start, int end) {

        long clockOn = System.currentTimeMillis();
        mergeSort(arr, start, end);
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
