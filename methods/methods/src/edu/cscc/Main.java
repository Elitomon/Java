package edu.cscc;

import java.util.Scanner;

public class Main {
    //main method
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize vars
        double lbs;
        double inches;
        double kilograms;
        double meters;
        double calculateBMI;


        System.out.print("please enter your weight in lbs: ");
        lbs = input.nextDouble();
        System.out.print("please enter your height in inches: ");
        inches = input.nextDouble();

        kilograms = convertToKilograms(lbs);
        meters = convertToMeters(inches);
        calculateBMI = calcBMI(kilograms,meters);

        System.out.println("your BMI is: " + calculateBMI +
                " your classification is: " + BMIClassification(calculateBMI));

    }

    //public methods
    public static double convertToKilograms(double lbs)
    {
        double kilo;
        kilo = lbs / 2.2046;

        return kilo;
    }

    public static double convertToMeters(double inches)
    {
        double meters;
        meters = inches / 39.37;

        return meters;

    }

    public static double calcBMI(double kilograms, double meters)
    {
        double bmi;
        bmi = kilograms / Math.pow(meters, 2);

        return bmi;
    }

    public static String BMIClassification(double cBMI)
    {
        String classification;

        if (cBMI <= 18.5){
            classification = "underweight";
        } else if (cBMI <= 25.0) {
            classification = "normal";
        } else if (cBMI <= 30.0) {
            classification = "overweight";
        } else {
            classification = "obese";
        }




        return classification;
    }

}
