package edu.cscc;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[10];
        x[0] = 1;
        x[1] = 2;
        for (int i = 2; i < x.length; i++) {
            x[i] = x[i - 1] * (i + 1);
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println((i + 1) + " !: "+x[i]);
        }
    }
}