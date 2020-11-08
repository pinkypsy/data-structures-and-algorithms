package ua.alvin.list.singly_linked_list.challenge2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        Integer eight = 8;

        IntegerLinkedList list = new IntegerLinkedList();

        Random random = new Random();

        int size = 6;
        int [] ints = new int[size];
        for (int i = 0; i < size; i++) {
            int j = random.nextInt(size);
            ints[i] = j;
            System.out.println("int: " + j);
            list.insertSorted(j);
            list.printList();
        }
        System.out.println(Arrays.toString(ints));
//        list.insertSorted(eight);
//        list.printList();
//        list.insertSorted(three);
//        list.printList();
//        list.insertSorted(four);
//        list.printList();
//        list.insertSorted(one);
//        list.printList();
//        list.insertSorted(five);
//        list.printList();
//        list.insertSorted(two);
//        list.printList();
    }
}
