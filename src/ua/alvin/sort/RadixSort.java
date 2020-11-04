package ua.alvin.sort;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int [] radixArray = new int[]{4725,4586,1330,8792,1594,5729};
        
        radixSort(radixArray,10,4);

        System.out.println(Arrays.toString(radixArray));
        
    }

    private static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input,i,radix);
        }
    }

    private static void radixSingleSort(int[] input, int position  , int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value :
                input) {
            countArray[getDigit(position, value, radix)]++;
        }

        //adjust the count array (like a 0,0,3,3,3,3,4,4,6)
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int [] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    //get digit at the very position. Count from end, i.e. position 0 is one's, position 1 is ten's, position 2 is hundred's, position 3 is thousand's
    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix,position) % radix;
    }


}
