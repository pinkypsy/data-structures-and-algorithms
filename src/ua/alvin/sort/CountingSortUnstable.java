package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

public class CountingSortUnstable {
    //unstable O(n), length and range should be known, but faster than quick sort

    public static void main(String[] args) {
//        int [] input = new int[] {12,15,19,18,12,18,17,10,14,13};
                int[] array = createRandomArray(1000000);

        evaluateAlgorithm(array);
//        countingSort(input, 10, 19);
//
//        System.out.println(Arrays.toString(input));
    }

    private static void countingSort(int[] input, int min, int max) {

        int [] countingArray = new int[(max - min) + 1];

        for (int i = 0; i < countingArray.length; i++) {
            countingArray[input[i] - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            while (countingArray[i - min] > 0){
                input[j++] = i;
                countingArray[i - min]--;
            }
        }

    }

    private static void evaluateAlgorithm(int[] arr) {
        long begin = System.currentTimeMillis();
        countingSort(arr, 0, 999999);
//        System.out.println(Arrays.toString(arr));
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
}
