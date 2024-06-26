package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = 0;
        if (input.hasNextInt()) age = input.nextInt();
        else input.nextLine();
        System.out.println("Your age is " + age);

        System.out.print("Please enter the money in your wallet: ");
        double wallet = 0;
        if (input.hasNextDouble()) wallet = input.nextDouble();
        else input.nextLine();
        System.out.println("The amount in your wallet is " + wallet);

    }
}
