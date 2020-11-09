package ua.alvin.queue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueue <Integer> queue = new ArrayQueue <>(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("size: " + queue.size());

        System.out.println();
        System.out.println(queue.remove());
        System.out.println("size: " + queue.size());
        System.out.println(queue.toString());

        queue.add(5);
        System.out.println();
        System.out.println(queue.remove());
        System.out.println("size: " + queue.size());
        System.out.println(queue.toString());

        System.out.println();
        System.out.println(queue.remove());
        System.out.println("size: " + queue.size());
        System.out.println(queue.toString());

        queue.add(6);


        System.out.println();
        System.out.println(queue.remove());
        System.out.println("size: " + queue.size());
        System.out.println(queue.toString());


//        queue.print();
//
//        System.out.println();
//        System.out.println(queue.peek());
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());
//
//        System.out.println();
//        System.out.println(queue.remove());
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());
//
//        System.out.println();
//        queue.add(9);
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());
//
//        System.out.println();
//        System.out.println(queue.remove());
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());
//
//
//        System.out.println();
//        queue.add(10);
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());
//
//        System.out.println();
//        queue.add(11);
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());
//
//        System.out.println();
//        System.out.println(queue.remove());
//        System.out.println("size: " + queue.size());
//        System.out.println(queue.toString());






    }
}
