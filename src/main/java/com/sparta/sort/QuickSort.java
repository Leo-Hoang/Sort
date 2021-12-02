package com.sparta.sort;

import java.util.ArrayList;

public class QuickSort implements Sort {

    public int[] sort(int[] array)
    {
        quickSort(array, 0, array.length -1);
        return array;
    }

    public ArrayList<Container> sort(ArrayList<Container> list) {
        quickSort(list, 0, list.size() -1);
        return list;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, y = high;

        while (i <= y)
        {
            while (arr[i] < pivot) { i++;}
            while (arr[y] > pivot) {y--;}
            if (i <= y)
            {
                int temp = arr[i];
                arr[i] = arr[y];
                arr[y] = temp;
                i++;
                y--;
            }
        }
        // Recursion
        if (low < y) quickSort(arr, low, y);
        if (high > i) quickSort(arr, i, high);
    }

    private void quickSort(ArrayList<Container> arr, int low, int high) {
        if (arr == null || arr.size() == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        Container pivot = arr.get(middle);
        int i = low, y = high;


        while (i <= y)
        {
            while (arr.get(i).compareTo(pivot) < 0) { i++;}
            while (arr.get(y).compareTo(pivot) > 0) {y--;}
            if (i <= y)
            {
                Container temp = arr.get(i);
                arr.set(i, arr.get(y));
                arr.set(y, temp);
                i++;
                y--;
            }
        }
        // Recursion
        if (low < y) quickSort(arr, low, y);
        if (high > i) quickSort(arr, i, high);
    }
}
