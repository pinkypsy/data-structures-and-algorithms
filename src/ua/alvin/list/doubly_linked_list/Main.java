package ua.alvin.list.doubly_linked_list;

import ua.alvin.list.doubly_linked_list.challenge1.Employee;
import ua.alvin.list.doubly_linked_list.challenge1.EmployeeDoublyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ua.alvin.list.doubly_linked_list.challenge1.Employee janeJones = new ua.alvin.list.doubly_linked_list.challenge1.Employee("Jane", "Jones", 123);
        ua.alvin.list.doubly_linked_list.challenge1.Employee johnDoe = new ua.alvin.list.doubly_linked_list.challenge1.Employee("John", "Doe", 4567);
        ua.alvin.list.doubly_linked_list.challenge1.Employee marySmith = new ua.alvin.list.doubly_linked_list.challenge1.Employee("Mary", "Smith", 22);
        ua.alvin.list.doubly_linked_list.challenge1.Employee mikeWilson = new ua.alvin.list.doubly_linked_list.challenge1.Employee("Mike", "Wilson", 3245);

        ua.alvin.list.doubly_linked_list.challenge1.Employee billEnd = new ua.alvin.list.doubly_linked_list.challenge1.Employee("Bill", "End", 78);

        ua.alvin.list.doubly_linked_list.challenge1.EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        list.addBefore(billEnd, johnDoe);
//        list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson);
        list.printList();
        System.out.println(list.getSize());
    }
}
