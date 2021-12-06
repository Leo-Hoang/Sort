package com.sparta.sort;
import java.util.*;

public class Menu {

    private static Scanner sc;
    private static String inp;
    private static int size = 0;
    private static boolean infiniteLoop = true;

    public static void menu() {

        displayFirstMenu();
        displaySecondMenu();

        // BUBBLE SORT
        if (inp.equals("1"))
        {
            displayThirdMenu();

            // Array
            if (inp.equals("1")) Controller.sortArray(size, "bubble");

            // ArrayList
            else if (inp.equals("2")) Controller.sortList(size, "bubble");
        }

        // QUICK SORT
        else if (inp.equals("2"))
        {
            displayThirdMenu();

            // Array
            if (inp.equals("1"))  Controller.sortArray(size, "quick");

            // ArrayList
            else if (inp.equals("2")) Controller.sortList(size, "quick");
        }

        // TREE SORT
        else if (inp.equals("3"))
        {
            displayThirdMenu();

            // Array
            if (inp.equals("1")) Controller.sortArray(size, "tree");

            // ArrayList
            else if (inp.equals("2")) Controller.sortList(size, "tree");
        }
    }

    // All of these menu methods display the UI to the user and also gets an input. If the user does not
    // put in a correct input, the method loops infinitely.
    private static void displayFirstMenu()
    {
        while (infiniteLoop)
        {
            System.out.println("How many numbers would you like to have?");
            sc = new Scanner(System.in);
            inp = sc.nextLine().trim();
            try {
                size = Integer.parseInt(inp);
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Must be a number!"); }
            if (size > 0) return;
            else System.out.println("Size of list must be at least 1!");
        }
    }

    private static void displaySecondMenu()
    {
        while (infiniteLoop)
        {
            System.out.println("Which sort algorithm would you like to use?");
            System.out.println("Input 1: Bubble Sort || Input 2: Quick Sort || Input 3: Tree Sort");
            sc = new Scanner(System.in);
            inp = sc.nextLine();
            if (inp.equals("1") || inp.equals("2") || inp.equals("3")) return;
            else System.out.println("ERROR! Input must be 1, 2 or 3!");
        }
    }

    private static void displayThirdMenu()
    {
        while (infiniteLoop)
        {
            System.out.println("Would you like to use an Array or ArrayList?");
            System.out.println("Input 1: Array || Input 2: ArrayList?");
            sc = new Scanner(System.in);
            inp = sc.nextLine();
            if (inp.equals("1") || inp.equals("2")) return;
            else System.out.println("ERROR! Input must be 1, 2 or 3!");
        }
    }

}
