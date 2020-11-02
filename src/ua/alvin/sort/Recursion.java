package ua.alvin.sort;

import java.math.BigInteger;

public class Recursion {
    public static void main(String[] args) {
//        evaluateAlgorithmIter(5);
        evaluateAlgorithmRecur(4);
    }

    static BigInteger factIter(int num) {

        if (num == 0) return BigInteger.valueOf(1);

        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    static int factRecur(int num) {
        if (num == 0) {
            System.out.println("<=");
            return 1;
        }
        System.out.println("=>");
        return num * factRecur(num - 1);
    }

    private static void evaluateAlgorithmIter(int arg) {
        long begin = System.currentTimeMillis();
        System.out.println(factIter(arg));
        long end = System.currentTimeMillis();
        System.out.println("Algorithm time: " + (end - begin) + " ms.");
    }
    private static void evaluateAlgorithmRecur(int arg) {
        long begin = System.currentTimeMillis();
        System.out.println(factRecur(arg));
        long end = System.currentTimeMillis();
        System.out.println("Algorithm time: " + (end - begin) + " ms.");
    }
}
