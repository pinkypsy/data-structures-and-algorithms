package ua.alvin.list.singly_linked_list.challenge2;

import java.util.AbstractList;
import java.util.Stack;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value){

        if (isEmpty() || head.getValue() >= value){
            addToFront(value);
            return;
        }

        //find insertion point

        IntegerNode previous = head;
        IntegerNode current = head.getNext();

        while (current != null && current.getValue() < value){
            previous = current;
            current = current.getNext();
        }


        IntegerNode newNode = new IntegerNode(value);
        previous.setNext(newNode);
        newNode.setNext(current);

        size++;


//    public void insertSorted(Integer value) {
//        IntegerNode current = head;
//        IntegerNode newNode = new IntegerNode(value);
//
//        if (isEmpty() || current.getValue() >= newNode.getValue()) {
//            newNode.setNext(head);
//            head = newNode;
//        } else {
//                IntegerNode advanceNode = current.getNext();
//
//                if (advanceNode == null || advanceNode.getValue() > newNode.getValue()) {
//                    current.setNext(newNode);
//                    newNode.setNext(advanceNode);
//                }
//        }
//        size++;


//        IntegerNode current = head;
//
//        while (current != null) {
//
//            if (current.getValue() >= value) {
//                newNode.setNext(current);
//            }
//
//            current = current.getNext();
//        }
//size++;

        // add your code here

    }

   /* public void insertSorted(Integer value) {

        IntegerNode newNode = new IntegerNode(value);


//        if (isEmpty()) {
//            newNode.setNext(head);
//            head = newNode;
//            size++;
//            return;
//        }

        newNode.setNext(head);
        head = newNode;

        IntegerNode current = head;

        for (int i = 0; i < size; i++) {
            IntegerNode advanceNode = current.getNext();

            if (newNode.getValue() <= current.getValue() && newNode.getValue() > advanceNode.getValue() || advanceNode == null) {
//            if (advanceNode == null || newNode.getValue() > advanceNode.getValue()) {
                System.out.println("hi");
                current.setNext(newNode);
                newNode.setNext(advanceNode);
                return;
            }
            current = current.getNext();

        }
        size++;

    }*/


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
