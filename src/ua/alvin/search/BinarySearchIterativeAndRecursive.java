package ua.alvin.search;

import java.util.Arrays;

public class BinarySearchIterativeAndRecursive {
    public static void main(String[] args) {
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(iterativeBinarySearch(array, -15));
        System.out.println(recursiveBinarySearch(-15,array, 0, array.length));

    }

    private static int iterativeBinarySearch(int[] array, int value) {

        int left = 0;
        int right = array.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                right = mid;
            } else if (array[mid] < value) {
                left = mid;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(int value, int[] array, int left, int right) {
        if (left >= right) return -1;

        int mid = (left + right) / 2;

        if (array[mid] == value) {
            return mid;
        }
        else if (value < array[mid]) {
            return recursiveBinarySearch(value,array,left,mid);
        }
        else {
            return recursiveBinarySearch(value,array,mid+1,right);
        }

    }
}
