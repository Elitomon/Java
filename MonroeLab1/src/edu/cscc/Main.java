package edu.cscc;

// Thomas Monroe, 01/24/22, calculating distance fallen and velocity

import java.util.Scanner;

public class Main {

    private static double velocity;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Free Fall Calculator");

        final int a = 32;

        System.out.print("Please enter the time while falling in seconds: ");
        double fallTime = 0;
        if (scanner.hasNextDouble()) fallTime = scanner.nextDouble();
        else scanner.nextLine();

        System.out.println("the duration of the objects fall was " + fallTime + " seconds");

        double distance = .5 * a * Math.pow(fallTime, 2);
        System.out.println("the distance fallen is " + distance + " feet");

        double velocity = a * fallTime;

        System.out.println("the Velocity of the object is " + velocity + " feet per second");


        scanner.close();

    }


}
