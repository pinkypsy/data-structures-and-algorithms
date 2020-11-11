package ua.alvin.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//O (n), not in place, stability depends on algorithm that do sort in buckets
public class BucketSort {

    public static void main(String[] args) {
        int[] input = new int[]{20, 35, 15, 7, 55, 1, 22};
        bucketSort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void bucketSort(int [] input){
        List <Integer> [] buckets = new List [input.length];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList();
        }

        for (int i = 0; i < buckets.length; i++) {
            buckets[searchPosition(input[i])].add(input[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        int j = 0;

        for (int i = 0; i < input.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int searchPosition(int value){
        return value /  10 % 7; // (value / (one's,ten's,hundred's etc) / array.length
    }
}
