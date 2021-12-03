package com.sparta.sort.test;

import com.sparta.sort.Container;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class GenerateTest {
    @AfterEach
    public void tearDown()
    {
        System.out.println("Another Test completed!");
    }

    @Test // Test for list size = 100.
    public void generateArrayList100()
    {
        ArrayList<Container> arrList = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            Random random = new Random();
            Container c = new Container(random.nextInt(100 - (-100)) - 100);
            arrList.add(c);
        }
        System.out.println(arrList.size());
        System.out.println(arrList.toString());
    }

    @Test // Test for list size = 10000.
    public void generateArrayList10000()
    {
        ArrayList<Container> arrList = new ArrayList<>();
        for (int i = 0; i < 10000; i++)
        {
            Random random = new Random();
            Container c = new Container(random.nextInt(100 - (-100)) - 100);
            arrList.add(c);
        }
        System.out.println(arrList.size());
        System.out.println(arrList.toString());
    }
}
