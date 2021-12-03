package com.sparta.sort;
import java.util.ArrayList;
import java.util.Random;

public class Generate {

    public static ArrayList<Container> generateArrayList(int size)
    {
        ArrayList<Container> arrList = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            Random random = new Random();
            Container c = new Container(random.nextInt(100 + 1 - (-100)) - 100);
            arrList.add(c);
        };
        return arrList;
    }

    public static int[] generateArray(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            Random random = new Random();
            arr[i] = random.nextInt(100 + 1 - (-100)) - 100;
        };
        return arr;
    }
}
