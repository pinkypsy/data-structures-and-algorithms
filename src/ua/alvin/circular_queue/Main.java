package ua.alvin.circular_queue;

public class Main {
    public static void main(String[] args) {
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>(5);

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

        queue.add(7);
        System.out.println("size: " + queue.size());
        System.out.println(queue.toString());

        System.out.println(queue.remove());
        System.out.println(queue.toString());

        System.out.println(queue.remove());
        System.out.println(queue.toString());

        System.out.println(queue.remove());
        System.out.println(queue.toString());
//no such element exception
        System.out.println(queue.remove());
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
