package ua.alvin.heap;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public void sort(){
        int lastHeapIndex = size - 1;

        for (int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;

            fixHeapBelow(0,lastHeapIndex - i - 1);
        }
    }


    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public int delete (int index){

        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParentIndex(index);
        int itemToDelete = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        size--;
        return itemToDelete;
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];

        while (index > 0 && newValue > heap[getParentIndex(index)]) {
            heap[index] = heap[getParentIndex(index)];
            index = getParentIndex(index);
        }
        heap[index] = newValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwapIndex;

        while (index <= lastHeapIndex) {
            int leftChildIndex = getChildIndex(index, true);
            int rightChildIndex = getChildIndex(index, false);

            if (leftChildIndex <= lastHeapIndex) {
                if (rightChildIndex > lastHeapIndex) {
                    childToSwapIndex = leftChildIndex;
                } else {
                    childToSwapIndex = (heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex);
                }

                if (heap[index] < heap[childToSwapIndex]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwapIndex];
                    heap[childToSwapIndex] = tmp;
                } else {
                    break;
                }
                index = childToSwapIndex;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int getChildIndex(int parentIndex, boolean isLeft) {
        return parentIndex * 2 + (isLeft ? 1 : 2);
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public int getSize() {
        return size;
    }
}
