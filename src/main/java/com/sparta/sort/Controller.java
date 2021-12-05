package com.sparta.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Controller {
    private static long startTime;
    private static long endTime;
    public static void sortArray(int[] array, String sortAlgorithm)
    {
        startTime = System.nanoTime();
        SortLog.log("Before Sort: " + Arrays.toString(array));
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
        endTime = System.nanoTime();
        SortLog.log("After Sort: " + Arrays.toString(array));
        SortLog.log("Time taken to sort array with " + sortAlgorithm + " sort: " + (endTime - startTime));
    }

    public static void sortList(ArrayList<Container> l)
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
