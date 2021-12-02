package com.sparta.sort;

import java.util.ArrayList;

public class BubbleSort implements Sort{

    public int[] sort(int[] array)
    {
        int temp;
        for(int y = array.length; y > 0; y--)
        {
            for (int i = 0; i < y -1; i++)
            {
                if (array[i] > array[i+1])
                {
                    //System.out.println(Arrays.toString(bubbleArray));
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }

    public ArrayList<Container> sort(ArrayList<Container> list)
    {
        Container temp;
        for(int y = list.size(); y > 0; y--)
        {
            for (int i = 0; i < y -1; i++)
            {
                if (list.get(i).compareTo(list.get(i+1)) > 0 )
                {
                    //System.out.println(Arrays.toString(bubbleArray));
                    temp = list.get(i) ;
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }
        }
        return list;
    }

}
