package ua.alvin.circular_queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularArrayQueue<T> {

    private T [] queue;
    private int front;
    private int back;

    public CircularArrayQueue(int capacity){
        queue = (T[]) new Object [capacity];
    }

    public void add(T element){
        if (size() == queue.length-1){
            int queueSize = size();
            T [] tempQueue = (T[]) new Object [queue.length * 2];
            System.arraycopy(queue,back,tempQueue,0,queue.length - front);
            System.arraycopy(queue,0,tempQueue,queue.length - front, back);
            queue = tempQueue;
            front = 0;
            back = queueSize;
        }
        queue[back] = element;

        if (back < queue.length - 1){
            back++;
        }else {
            back = 0;
        }
    }

    public T remove(){
        if (size() == 0){
            throw new NoSuchElementException();
        }

        T element = queue[front];
        queue[front] = null;
        front++;


        if (size() == 0){
            front = 0;
            back = 0;
        }
        else if (front == queue.length){
            front = 0;
        }
        return element;
    }

    public T element(){
        if (size() == 0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void print(){
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }


    public int size(){
        if (front <= back){
            return back - front;
        }
        else{
            return back- front + queue.length;
        }
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
