package edu.cscc;

import java.util.Scanner;
import java.util.Arrays;

// Tom Monroe, 2/16/22, grocery list
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int count= 0; // number of items currently in the grocery list
        String[] groceryList = new String[6];
        String item;

        while (count < 6) {
            System.out.print("please enter the items of your list: ");
            groceryList[count] = input.nextLine();

            item = groceryList[count];
            if (isDuplicate(item, groceryList, count)) {
                System.out.print("re-enter item: ");
                groceryList[count] = input.nextLine();
            }

            count++;
        }

        Arrays.sort(groceryList);
        System.out.println();
        System.out.println("the grocery list it: ");

        for (String i: groceryList) {
            System.out.println(i);
        }


    }
    public static boolean isDuplicate(String item, String[] groceryList, int count) {
        boolean duplicate = false;

        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (item.equals(groceryList[j])) {
                    duplicate = true;
                    break;
                }

            }
        }
        return (duplicate);
    }

}
