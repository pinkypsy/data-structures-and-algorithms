package ua.alvin.stack.arraystack;

import ua.alvin.entity.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            Employee[] newEmployees = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newEmployees, 0, stack.length);
            stack = newEmployees;
        }

        stack[top++] = employee;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public Employee pop(){

        if (isEmpty()) throw new EmptyStackException();

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek(){
        if (isEmpty()) throw new EmptyStackException();

        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
