package ua.alvin.hashtable.hashtableschallenge2;

import ua.alvin.entity.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class DeleteDuplicatesWithoutOrder {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(System.out::println);

        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee employee: employees) {
            employeeMap.put(employee.getId(), employee);
        }

        employees.clear();

        employees.addAll(employeeMap.values());
        System.out.println();
        employees.forEach(e -> System.out.println(e));

    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
