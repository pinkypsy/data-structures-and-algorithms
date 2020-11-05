package ua.alvin.list.doubly_linked_list;

import ua.alvin.entity.Employee;

public class Main {
    public static void main(String[] args) {

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addHead(new Employee("Bob", "Uncle", 99));
        list.addHead(new Employee("Lisa", "Sven", 42));
        list.addHead(new Employee("Jeffrey", "Master", 58));
        list.addHead(new Employee("Stacey", "Linx", 19));

        list.addTail(new Employee("Tailor", "Swift", 30));
        System.out.println(list.getSize());
        list.printList();

        System.out.println("==================");

        list.removeHead();
        System.out.println(list.getSize());
        list.printList();
        System.out.println("==================");

        list.removeTail();
        System.out.println(list.getSize());
        list.printList();
    }
}
