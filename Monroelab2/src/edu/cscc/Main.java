package edu.cscc;
import java.util.Scanner;

// Tom Monroe, 02/01/22, switch statements for hurricane wind classification

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter wind speed in MPH: ");
        int windSpeed = 0;
        if (scanner.hasNextInt()) windSpeed = scanner.nextInt();
        else scanner.nextLine();

        if (windSpeed <= 38) {
            System.out.println("the hurricane does not classify");
        } else if (windSpeed <= 73) {
            System.out.println("the hurricane is a tropical storm");
        } else if (windSpeed <= 95) {
            System.out.println("it is a category one hurricane");
        } else if (windSpeed <= 110) {
            System.out.println("it is a category two hurricane");
        } else if (windSpeed <= 129) {
            System.out.println("it is a category three hurricane");
        } else if (windSpeed <= 156) {
            System.out.println("it is a category four hurricane");
        } else {
            System.out.print("it is a category five hurricane");
        }

        scanner.close();
    }
}
