package ua.alvin.circular_queue.challendge_palindorme;

import ua.alvin.circular_queue.CircularArrayQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("I did, did i?"));
        System.out.println(isPalindrome("Hello"));
    }

    static boolean isPalindrome(String lineToCheck) {

        String lowerCaseLine = lineToCheck.toLowerCase();
        LinkedList <Character> stack = new LinkedList<>();
        LinkedList <Character> queue = new LinkedList<>();

        for (int i = 0; i < lineToCheck.length(); i++) {
            char ch = lowerCaseLine.charAt(i);
            if (!Character.isLetter(ch)) {
                continue;
            }
            stack.push(ch);//LIFO
            queue.addLast(ch);//FIFO
        }

        System.out.println(stack.toString());
        System.out.println(queue.toString());


        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.removeFirst())) return false;
        }
        return true;
    }
}
