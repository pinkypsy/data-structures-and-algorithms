package ua.alvin.sort;

import java.util.Arrays;
import java.util.Random;

//gap is length/3, but it can be more complex and productive
//in-place, faster than insertion sort, but unstable
public class ShellSort {

    public static void main(String[] args) {
        int[] array = new int[]{5,2,0,4,1,-2};
//        int[] array = createRandomArray(1000000);
        evaluateAlgorithm(array);
    }

    private static void shellSort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                int newElem = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newElem) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElem;
            }
        }
    }



    private static void evaluateAlgorithm(int[] arr) {
        long begin = System.currentTimeMillis();
        shellSort(arr);
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
}
