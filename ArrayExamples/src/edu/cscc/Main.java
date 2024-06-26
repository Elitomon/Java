package edu.cscc;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare String array
        String[] myarr;

        // Instantiate String array
        myarr = new String[5];

        // Declare, instantiate, and initialize array
        String[] otherarr = { "Ravi", "Hector", "Susan", "Mariko" };

        // Print an array
        System.out.println("--- Print an array ---");
        for (int i=0; i<otherarr.length; ++i) {
            System.out.print(otherarr[i]);
            System.out.print("  "); // print two spaces
        }
        System.out.println(); // print newline

        // Print array in reverse
        System.out.println("\n--- Print an array in reverse ---");
        for (int i=otherarr.length-1; i>=0; --i) {
            System.out.print(otherarr[i]);
            System.out.print("  "); // print two spaces
        }
        System.out.println(); // print newline

        // Copy contents of one array to another (larger array)
        for (int i=0; i<otherarr.length; ++i) {
            myarr[i] = otherarr[i];
        }

        // Print contents of two arrays
        System.out.println("\n--- Contents of Arrays after copying ---");
        printArray(otherarr,"otherarr");
        printArray(myarr,"myarr");

        // Get a String from the user and add it to the end of the array
        System.out.print("What is your name: ");
        String yourName = input.next();
        myarr[4] = yourName;

        // Print array
        System.out.println("\n--- Array after input ---");
        printArray(myarr,"myarr");

        // Sort array
        Arrays.sort(myarr);

        // Print array after sorting
        System.out.println("--- Array after sorting ---");
        printArray(myarr,"myarr");
    }

    /**
     * Method to print an array
     * @param arr - String array to be printed
     * @param arrayName - name of the array (to print as label)
     */
    public static void printArray(String[] arr,String arrayName) {
        for (int i=0; i<arr.length; ++i) {
            System.out.println(arrayName+"["+i+"]=\""+arr[i]+"\"  ");
        }
        System.out.println();
    }
}
