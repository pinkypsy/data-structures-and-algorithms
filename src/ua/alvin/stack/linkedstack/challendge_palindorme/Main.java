package ua.alvin.stack.linkedstack.challendge_palindorme;

import ua.alvin.entity.Employee;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("Racecar"));
//        System.out.println(isPalindrome("I did, did i?"));
        System.out.println(isPalindrome("Hello"));

    }

    static boolean isPalindrome(String lineToCheck) {

//        boolean isPalindrome = true;

//        LinkedStack stack = new LinkedStack();
        LinkedList<Character> stack = new LinkedList<>();
        List <Character> list  = new ArrayList<>(lineToCheck.length());

        for (int i = 0; i < lineToCheck.length(); i++) {
            char ch = lineToCheck.charAt(i);
            if (!Character.isLetter(ch)) continue;

            stack.push(ch);
            list.add(ch);
        }


        for (int i = 0; i < list.size(); i++) {
            char fromListLowerCase = Character.toLowerCase(list.get(i));
            char fromStackLowerCase = Character.toLowerCase(stack.pop());

            System.out.println(fromListLowerCase + " " + fromStackLowerCase);

            if (fromListLowerCase != fromStackLowerCase) return false;
        }

        Iterator<Character> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        return true;
    }
}
