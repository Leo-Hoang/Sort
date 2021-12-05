package com.sparta.sort;
import java.util.*;

public class Menu {

    static long startTime;
    static long endTime;
    static Scanner sc;
    static String inp;
    static int size = 0;
    static boolean infiniteLoop = true;

    public static void menu() {

        displayFirstMenu();
        displaySecondMenu();

        // BUBBLE SORT
        if (inp.equals("1"))
        {
            BubbleSort bs = new BubbleSort();
            displayThirdMenu();

            // ARRAY
            if (inp.equals("1"))
            {
                int[] bubbleArray = Generate.generateArray(size);
                SortLog.log(Arrays.toString(bubbleArray));
                startTime = System.nanoTime();
                bs.sort(bubbleArray);
                endTime = System.nanoTime();
                SortLog.log("Time taken to sort array with Bubble Sort: " + (endTime - startTime));
                SortLog.log(Arrays.toString(bubbleArray));
            }

            // ARRAYLIST
            else if (inp.equals("2"))
            {
                ArrayList<Container> bubbleList = Generate.generateArrayList(size);
                ArrayList<Container> bubbleListClone = (ArrayList<Container>)bubbleList.clone();
                startTime = System.nanoTime();
                bs.sort(bubbleList);
                endTime = System.nanoTime();
                System.out.println("Personal algorithm time taken: " + (endTime - startTime) + " nanoseconds");

                // Compare to inbuilt .sort()
                startTime = System.nanoTime();
                Collections.sort(bubbleListClone);
                endTime = System.nanoTime();
                System.out.println("Collections.sort() time taken: " + (endTime - startTime) + " nanoseconds");
                System.out.println(bubbleList);
            }
        }

        // QUICK SORT
        else if (inp.equals("2"))
        {
            QuickSort qs = new QuickSort();
            displayThirdMenu();

            // ARRAY
            if (inp.equals("1"))
            {
                int[] quickArray = Generate.generateArray(size);
                startTime = System.nanoTime();
                qs.sort(quickArray);
                System.out.println(Arrays.toString(quickArray));
                endTime = System.nanoTime();
                System.out.println("Time taken: " + (endTime - startTime));
            }

            // ARRAYLIST
            else if (inp.equals("2"))
            {
                ArrayList<Container> quickList = Generate.generateArrayList(size);
                ArrayList<Container> quickListClone = (ArrayList<Container>)quickList.clone();
                startTime = System.nanoTime();
                qs.sort(quickList);
                endTime = System.nanoTime();
                System.out.println("Personal algorithm time taken: " + (endTime - startTime) + " nanoseconds");

                // Compare to inbuilt .sort()
                startTime = System.nanoTime();
                Collections.sort(quickListClone);
                endTime = System.nanoTime();
                System.out.println("Collections.sort() time taken: " + (endTime - startTime) + " nanoseconds");
                System.out.println(quickList);
            }
        }

        // TREE SORT
        else if (inp.equals("3"))
        {
            TreeSort ts = new TreeSort();
            displayThirdMenu();

            // ARRAY
            if (inp.equals("1"))
            {
                int[] treeArray = Generate.generateArray(size);
                startTime = System.nanoTime();
                ts.sort(treeArray);
                System.out.println(Arrays.toString(treeArray));
                endTime = System.nanoTime();
                System.out.println("Time taken: " + (endTime - startTime));
            }

            // ARRAYLIST
            else if (inp.equals("2"))
            {
                ArrayList<Container> treeList = Generate.generateArrayList(size);
                ArrayList<Container> treeListClone = (ArrayList<Container>)treeList.clone();
                startTime = System.nanoTime();
                ts.sort(treeList);
                endTime = System.nanoTime();
                System.out.println("Personal algorithm time taken: " + (endTime - startTime) + " nanoseconds");

                // Compare to inbuilt .sort()
                startTime = System.nanoTime();
                Collections.sort(treeListClone);
                endTime = System.nanoTime();
                System.out.println("Collections.sort() time taken: " + (endTime - startTime) + " nanoseconds");
                System.out.println(treeList);
            }
        }
    }

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
            if (inp.equals("1") || inp.equals("2") || inp.equals("3")) return;
            else System.out.println("ERROR! Input must be 1, 2 or 3!");
        }
    }

}
