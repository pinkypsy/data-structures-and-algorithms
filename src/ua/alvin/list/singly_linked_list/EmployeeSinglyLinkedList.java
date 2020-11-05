package ua.alvin.list.singly_linked_list;

import ua.alvin.entity.Employee;

public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int size;

    public void addElementToHead(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;

        size++;
    }

    public EmployeeNode removeFromHead(){

        if (isEmpty()) return null;

        EmployeeNode nodeForRemove = head;
        head = head.getNext();
        nodeForRemove.setNext(null);
        size--;

        return nodeForRemove;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){

        EmployeeNode current = head;

        System.out.println("HEAD");
        while (current != null){
            System.out.println(current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}
