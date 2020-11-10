package ua.alvin.hashtable;

import ua.alvin.entity.Employee;

public class Main {
    public static void main(String[] args) {
//        ArrayHashTable <Employee> hashTable = new ArrayHashTable<>();
//
//        Employee johnDoe = new Employee("Bob", "Think", 20);
//        Employee janeJones = new Employee("Helen", "Wurst", 23);
//        Employee charlie = new Employee("Charlie", "Trump", 30);
//
//        hashTable.put(johnDoe.getFirstName(),johnDoe);
//        hashTable.put(janeJones.getFirstName(), janeJones);
//        hashTable.put(charlie.getFirstName(), charlie);
//
//        hashTable.print();
//

//        ArrayHashTableLinearProbing hashTable = new ArrayHashTableLinearProbing();

        HashTableChained hashTable = new HashTableChained(1);

        Employee johnDoe = new Employee("John", "Doe", 20);
        Employee janeJones = new Employee("Jane", "Jones", 23);
        Employee mikeWilson = new Employee("Mike", "Wilson", 26);
        Employee marySmith = new Employee("Mary", "Smith", 44);

        hashTable.put(johnDoe.getLastName(),johnDoe);
        hashTable.put(janeJones.getLastName(),janeJones);
        hashTable.put(mikeWilson.getLastName(),mikeWilson);
        hashTable.put(marySmith.getLastName(),marySmith);

        hashTable.print();
        System.out.println();

        System.out.println("Removed: " + hashTable.remove(janeJones.getLastName()));
        System.out.println();

        System.out.println("Removed: " + hashTable.remove(mikeWilson.getLastName()));
        System.out.println();

        hashTable.print();

        System.out.println();

        System.out.println("Get: " + hashTable.get(marySmith.getLastName()));

    }
}
