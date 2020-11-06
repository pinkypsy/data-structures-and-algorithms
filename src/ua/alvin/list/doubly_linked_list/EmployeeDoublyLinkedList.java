package ua.alvin.list.doubly_linked_list;

import ua.alvin.entity.Employee;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    public void addHead(Employee employee) {

        EmployeeNode employeeNode = new EmployeeNode(employee);


        if (head == null) {
            tail = employeeNode;
        } else {
            head.setPrevious(employeeNode);
            employeeNode.setNext(head);
        }
        head = employeeNode;

        size++;
    }

    public void addTail(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);


        if (tail == null) {
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail = employeeNode;

        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if (head == null) {
            return false;
        }

        // find the existing employee
        EmployeeNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current) {
            head = newNode;
        }
        else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return true;
    }

    public EmployeeNode removeHead() {

        if (isEmpty()) return null;

        EmployeeNode nodeForRemove = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        nodeForRemove.setNext(null);
        size--;

        return nodeForRemove;
    }

    public EmployeeNode removeTail() {
        if (isEmpty()) return null;

        EmployeeNode nodeForRemove = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();

        nodeForRemove.setPrevious(null);
        size--;
        return nodeForRemove;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {

        EmployeeNode current = head;

        System.out.println("HEAD");
        while (current != null) {
            System.out.println(current);
            System.out.println("<->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}
