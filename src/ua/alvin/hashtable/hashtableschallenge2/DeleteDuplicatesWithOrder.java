package ua.alvin.hashtable.hashtableschallenge2;

import ua.alvin.entity.Employee;

import java.util.*;

public class DeleteDuplicatesWithOrder {

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

        Map<Integer, Employee> employeeMapTemp = new HashMap<>();
        List<Employee> employeesToRemove = new ArrayList<>();
        ListIterator<Employee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            Employee tempEmployee = iterator.next();
            if (employeeMapTemp.containsKey(tempEmployee.getId())) {
                employeesToRemove.add(tempEmployee);
            }
            employeeMapTemp.put(tempEmployee.getId(), tempEmployee);
        }

        for (Employee employeeToRemove : employeesToRemove) {
            employees.remove(employeeToRemove); //remove first
//            employees.removeLastOccurrence(employeeToRemove); //remove last
        }

        System.out.println();

        employees.forEach(System.out::println);
    }

}
