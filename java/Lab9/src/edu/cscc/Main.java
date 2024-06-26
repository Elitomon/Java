package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * read in txt file, output items and calculate total
 * @author thomas monroe 04/1/22
 */
public class Main {
    static final String INPUTFILE = "components.txt";
    static final String PRINTFFORMAT = "%20s %2d    %6.2f\n";
    public static void main(String[] args) {
    	double total = 0;
	    File infile = new File(INPUTFILE);
	    System.out.printf("%s%n","           Component Units Price");

	    // TODO - add code that reads the input file, prints a component report, and calculates total cost
        try {
            String name;
            Scanner input = new Scanner(infile);

            while (input.hasNext()) {
                double price = 0;
                int units = 0;
                name = input.nextLine();

                String[] array = name.split(",");

                for (int i=0; i<=2; i++) {
                    price = Double.parseDouble(array[2]);
                    units = Integer.parseInt(array[1]);
                    total = total + (price * units);
                }
                System.out.printf(PRINTFFORMAT, array[0], units, price);
            }

        }catch (FileNotFoundException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

	    System.out.println("Total cost: "+ (total / 3));
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */