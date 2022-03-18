package org.roopsai.Mathematics;

public class Factorial {

    // Recursive
    public static int factorial(int n) {
        // Base case
        if (n==0) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(1));
    }


}
