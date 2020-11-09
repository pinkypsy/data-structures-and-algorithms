package ua.alvin.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue <T> {

    private T [] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = (T[]) new Object [capacity];
    }

    public void add(T element){
        if (back == queue.length){
            T [] tempQueue = (T[]) new Object [queue.length * 2];
            System.arraycopy(queue,0,tempQueue,0,queue.length);
            queue = tempQueue;
        }
        queue[back++] = element;
    }

    public T remove(){
        if (size() == 0){
            throw new NoSuchElementException();
        }

        T element = queue[front++];

        queue[front-1] = null;

        if (size() == 0){
            front = 0;
            back = 0;
        }
        return element;
    }

    public T peek(){
        if (size() == 0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void print(){
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }


    public int size(){
        return back - front;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", front=" + front +
                ", back=" + back +
                '}';
    }
}
