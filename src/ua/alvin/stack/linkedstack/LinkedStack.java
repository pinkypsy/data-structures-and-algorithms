package ua.alvin.stack.linkedstack;

import ua.alvin.entity.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        Iterator<Employee> iterator = stack.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
