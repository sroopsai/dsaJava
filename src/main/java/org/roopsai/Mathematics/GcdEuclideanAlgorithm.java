package org.roopsai.Mathematics;

public class GcdEuclideanAlgorithm {

    public static int gcd(int a, int b) {
        while (a!=b) {
            if (a<b) b = b-a;
            else a = a-b;
        }
        return a;
    }

    // Optimised Solution (Recursive)
    public static int gcdOptimized(int a, int b) {
        if (b==0) return a;
        return gcdOptimized(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(2,5));
        System.out.println(gcdOptimized(2,5));
    }
}
