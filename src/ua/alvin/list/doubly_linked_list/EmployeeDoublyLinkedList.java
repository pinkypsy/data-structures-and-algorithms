package ua.alvin.list.doubly_linked_list;

import ua.alvin.entity.Employee;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    public void addHead(Employee employee){

        EmployeeNode employeeNode = new EmployeeNode(employee);

        employeeNode.setNext(head);

        if (isEmpty()) {
            tail = employeeNode;
        }else{
            head.setPrevious(employeeNode);
        }
        head = employeeNode;

        size++;
    }

    public void addTail(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);

        employeeNode.setPrevious(tail);

        if (isEmpty()){
            head = employeeNode;
        }else {
            tail.setNext(employeeNode);
        }
        tail = employeeNode;

        size++;
    }

    public EmployeeNode removeHead(){

        if (isEmpty()) return null;

        EmployeeNode nodeForRemove = head;
        head = head.getNext();
        nodeForRemove.setNext(null);
        size--;

        return nodeForRemove;
    }
///////////////CHECK
    public EmployeeNode removeTail(){
        if (isEmpty()) return null;

        EmployeeNode nodeForRemove = tail;

        tail = tail.getPrevious();

        nodeForRemove.setPrevious(null);
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
            System.out.println("<->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}
