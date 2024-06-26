package edu.cscc;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double weight;
        double height;
        double calcBMI;
        String status;

        System.out.print("please enter your weight in lbs: ");
        weight = input.nextDouble();
        System.out.print("please enter your height in inches: ");
        height = input.nextDouble();

        calcBMI = Math.round((weight / 2.2046) / Math.pow((height / 39.37), 2));

        if (calcBMI <= 18.5) {
            status = "underweight";
        } else if (calcBMI <= 25.0) {
            status = "normal";
        } else if (calcBMI <= 30) {
            status = "overweight";
        } else {
            status = "obese";
        }

        System.out.println("your BMI is: " + calcBMI + " you are: " + status);


    }
}
