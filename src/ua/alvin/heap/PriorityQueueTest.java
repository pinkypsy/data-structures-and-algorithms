package ua.alvin.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder()); //biggest first
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());//smallest first

//        pq.add(25);
//        pq.add(-22);
//        pq.add(1343);
//        pq.add(54);
//        pq.add(0);
//        pq.add(-3492);
//        pq.add(429);

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);

//        System.out.println(pq.peek());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
//        System.out.println(pq.remove(54));

        Object[] ints = pq.toArray();
        for (Object num: ints) {
            System.out.println(num);
        }

        //System.out.println(pq.peek());
        pq.add(-1);
        //System.out.println(pq.peek());
    }
}
