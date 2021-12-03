package com.sparta.sort;
import java.util.*;

public class Menu {

    static long startTime;
    static long endTime;
    static Scanner sc;
    static String inp;
    static int size = 0;

    public static void menu() {

        displayFirstMenu();
        displaySecondMenu();
        // BUBBLE SORT
        if (inp.equals("1"))
        {
            displayThirdMenu();
            BubbleSort bs = new BubbleSort();

            // ARRAY
            if (inp.equals("1"))
            {
                int[] bubbleArray = {5,6,1,3,0,2,8,7,9,4};
                startTime = System.nanoTime();
                bs.sort(bubbleArray);
                System.out.println(Arrays.toString(bubbleArray));
                endTime = System.nanoTime();
                System.out.println("Time taken: " + (endTime - startTime));
            }

            // ARRAYLIST
            else if (inp.equals("2"))
            {
                //ArrayList<Integer> bubbleList = new ArrayList<Integer>(List.of(5,6,1,3,0,2,8,7,9,4));
                //ArrayList<T> bubbleList = new ArrayList<T>((Collection<? extends T>) List.of(5,6,1,3,0,2,8,7,9,4));

                ArrayList<Container> bubbleList = Generate.generateArrayList(size);
                startTime = System.nanoTime();
                System.out.println(bubbleList);
                bs.sort((ArrayList<Container>) bubbleList);
                System.out.println(bubbleList);
                endTime = System.nanoTime();
                System.out.println("Personal algorithm time taken: " + (endTime - startTime) + " nanoseconds");

                ArrayList<Integer> bubbleList2 = new ArrayList<>(List.of(5,6,1,3,0,2,8,7,9,4));
                startTime = System.nanoTime();
                Collections.sort(bubbleList2);
                endTime = System.nanoTime();
                System.out.println("Collections.sort() time taken: " + (endTime - startTime) + " nanoseconds");
            }
            // ERROR
            else { System.out.println("ERROR! Must be 1 or 2!"); }
        }

        // QUICKSORT
        else if (inp.equals("2"))
        {
            displayThirdMenu();
            QuickSort qs = new QuickSort();

            // ARRAY
            if (inp.equals("1"))
            {
                int[] quickArray = {5,6,1,3,0,2,8,7,9,4};
                startTime = System.nanoTime();
                qs.sort(quickArray);
                System.out.println(Arrays.toString(quickArray));
                endTime = System.nanoTime();
                System.out.println("Time taken: " + (endTime - startTime));
            }

            // ARRAYLIST
            else if (inp.equals("2"))
            {
                //ArrayList<Integer> quickList = new ArrayList<>(List.of(5,6,1,3,0,2,8,7,9,4));
                //ArrayList<T> quickList = new ArrayList<T>((Collection<? extends T>) List.of(5,6,1,3,0,2,8,7,9,4));

                ArrayList<Container> quickList = Generate.generateArrayList(size);
                startTime = System.nanoTime();
                qs.sort(quickList);
                System.out.println(quickList);
                endTime = System.nanoTime();
                System.out.println("Personal algorithm time taken: " + (endTime - startTime) + " nanoseconds");

                ArrayList<Integer> quickList2 = new ArrayList<>(List.of(5,6,1,3,0,2,8,7,9,4));
                startTime = System.nanoTime();
                Collections.sort(quickList2);
                endTime = System.nanoTime();
                System.out.println("Collections.sort() time taken: " + (endTime - startTime) + " nanoseconds");
            }

            // ERROR
            else { System.out.println("ERROR! Must be 1 or 2!"); }
        }

        else { System.out.println("ERROR! Must be 1 or 2!"); }
    }

    private static void displayFirstMenu()
    {
        boolean gate = false;
        while (gate == false)
        {
            System.out.println("How many numbers would you like to have?");
            sc = new Scanner(System.in);
            inp = sc.nextLine().trim();
            try {
                size = Integer.parseInt(inp);
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Must be a number!"); }
            if (size > 0) {
                gate = true;
            }
            else {
                System.out.println("Size of list must be at least 1!");
            }
        }

    }

    private static void displaySecondMenu()
    {
        System.out.println("Which sort algorithm would you like to use?");
        System.out.println("Input 1: Bubble Sort || Input 2: Quick Sort");
        sc = new Scanner(System.in);
        inp = sc.nextLine();
    }

    private static void displayThirdMenu()
    {
        System.out.println("Would you like to use an Array or ArrayList?");
        System.out.println("Input 1: Array || Input 2: ArrayList?");
        sc = new Scanner(System.in);
        inp = sc.nextLine();
    }

}
