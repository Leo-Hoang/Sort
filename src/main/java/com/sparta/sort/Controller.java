package com.sparta.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Controller {
    private static long startTime;
    private static long endTime;
    private static String beforeSort;
    private static String afterSort;
    private static String timeTaken;
    private static int[] array;
    private static ArrayList<Container> list;

    // Both of these static methods time, logs with log4j2, generates an array and then sorts them.
    public static void sortArray(int size, String sortAlgorithm)
    {
        array = Generate.generateArray(size);
        beforeSort = "Before Sort: " + Arrays.toString(array);
        startTime = System.nanoTime();
        switch(sortAlgorithm) {
            case "bubble":
                BubbleSort bs = new BubbleSort();
                bs.sort(array);
                break;
            case "quick":
                QuickSort qs = new QuickSort();
                qs.sort(array);
                break;
            case "tree":
                TreeSort ts = new TreeSort();
                ts.sort(array);
                break;
            default:
                System.out.println("SORT ALGORITHM ARGUMENT IS WRONG!");
        }
        // Log times for personal sort method
        endTime = System.nanoTime();
        afterSort = "After Sort:  " + Arrays.toString(array);
        timeTaken = "Time taken to sort array with " + sortAlgorithm + " sort: " + (endTime - startTime) + " nanoseconds";

        SortLog.log(timeTaken);
        SortLog.log(beforeSort);
        SortLog.log(afterSort);
    }

    public static void sortList(int size, String sortAlgorithm)
    {
        list = Generate.generateArrayList(size);
        ArrayList<Container> listClone = (ArrayList<Container>)list.clone();
        beforeSort = "Before Sort: " + list;
        startTime = System.nanoTime();

        switch(sortAlgorithm) {
            case "bubble":
                BubbleSort bs = new BubbleSort();
                bs.sort(list);
                break;
            case "quick":
                QuickSort qs = new QuickSort();
                qs.sort(list);
                break;
            case "tree":
                TreeSort ts = new TreeSort();
                ts.sort(list);
                break;
            default:
                System.out.println("SORT ALGORITHM ARGUMENT IS WRONG!");
        }
        // Log times for personal sort method
        endTime = System.nanoTime();
        afterSort = "After Sort:  " + list;
        timeTaken = "Time taken to sort array with personal " + sortAlgorithm + " sort algorithm: " + (endTime - startTime) + " nanoseconds";
        SortLog.log(timeTaken);
        SortLog.log(beforeSort);
        SortLog.log(afterSort);

        // Log times for Collections.sort()
        startTime = System.nanoTime();
        Collections.sort(listClone);
        endTime = System.nanoTime();
        SortLog.log("Time taken to sort array with Collections.sort(): " + (endTime - startTime) + " nanoseconds");
    }
}
