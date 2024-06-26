package edu.cscc;

public class Factorial {
    public long compute(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number is invalid input");
        }
        else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * compute(n-1);
        }
    }
}
