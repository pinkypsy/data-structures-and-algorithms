package ua.alvin.list.singly_linked_list;

import ua.alvin.entity.Employee;

public class Main {
    public static void main(String[] args) {

        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

        list.addElementToHead(new Employee("Bob", "Uncle", 99));
        list.addElementToHead(new Employee("Lisa", "Sven", 42));
        list.addElementToHead(new Employee("Jeffrey", "Master", 58));
        list.addElementToHead(new Employee("Stacey", "Linx", 19));

        System.out.println(list.getSize());
        list.printList();

        System.out.println("==================");

        list.removeFromHead();
        System.out.println(list.getSize());
        list.printList();
    }
}
