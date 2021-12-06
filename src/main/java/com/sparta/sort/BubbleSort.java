package com.sparta.sort;

import java.util.ArrayList;

public class BubbleSort implements Sort{

    public void sort(int[] array)
    {
        System.out.println("Sorting an Array with Bubble Sort...");
        int temp;
        for(int y = array.length; y > 0; y--)
        {
            for (int i = 0; i < y -1; i++)
            {
                if (array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

    public void sort(ArrayList<Container> list)
    {
        System.out.println("Sorting an ArrayList with Bubble Sort...");
        Container temp;
        for(int y = list.size(); y > 0; y--)
        {
            for (int i = 0; i < y -1; i++)
            {
                if (list.get(i).compareTo(list.get(i+1)) > 0 )
                {
                    temp = list.get(i) ;
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }
        }
    }

}
