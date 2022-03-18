package org.roopsai.Mathematics;

public class LCMOfTwoNumbers {

    public static int lcm(int a, int b) {
        return a*b/GcdEuclideanAlgorithm.gcdOptimized(a, b);
    }

}
