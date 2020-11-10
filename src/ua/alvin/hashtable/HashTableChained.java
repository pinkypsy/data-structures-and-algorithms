package ua.alvin.hashtable;

import ua.alvin.entity.Employee;
import ua.alvin.entity.EmployeeStored;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashTableChained {

    private LinkedList<EmployeeStored>[] table;

    public HashTableChained(int capacity) {
        table = new LinkedList[capacity];

//        Arrays.fill(table, new LinkedList<>()); //it is the same
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {

        int hashedKey = hashKey(key);

        table[hashedKey].add(new EmployeeStored(key, employee));

    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);

        ListIterator<EmployeeStored> iterator = table[hashedKey].listIterator();

        EmployeeStored employeeStored = null;
        while (iterator.hasNext()) {
            employeeStored = iterator.next();
            if (employeeStored.getKey().equals(key)) {
                return employeeStored.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<EmployeeStored> iterator = table[hashedKey].listIterator();

        EmployeeStored employeeStored = null;
        int index = -1;
        while (iterator.hasNext()) {
            index++;
            employeeStored = iterator.next();
            if (employeeStored.getKey().equals(key)) {
                break;
            }
        }

        if (employeeStored == null || !employeeStored.getKey().equals(key)) {
            return null;
        } else table[hashedKey].remove(index);
        return employeeStored.getEmployee();
    }


    private int hashKey(String key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public void print(){

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null){
                ListIterator<EmployeeStored> iterator = table[i].listIterator();
                System.out.print("In position: " + i + " ");
                while (iterator.hasNext()){
                    System.out.print(iterator.next().getEmployee() + " -> ");
                }
                System.out.println("null");
            }
        }
    }
}
