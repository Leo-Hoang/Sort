package com.sparta.sort.test;

import com.sparta.sort.BubbleSort;
import com.sparta.sort.Container;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortListTest {

    private BubbleSort bs;
    @BeforeEach
    public void setUp()
    {
        bs = new BubbleSort();
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("Another Test completed!");
    }

    @Test
    public void basicTestList()
    {
        int[] bubbleArray = {5,6,1,3,0,2,8,7,9,4};
        ArrayList<Container> bubbleList = new ArrayList<>();
        for (int e: bubbleArray) bubbleList.add(new Container(e));
        bs.sort(bubbleList);
        int[] correct = {0,1,2,3,4,5,6,7,8,9};
        String compare1 = bubbleList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void duplicateNumbersTestList()
    {
        int[] bubbleArray = {5,1,3,5,1,3,1,3,5,1};
        ArrayList<Container> bubbleList = new ArrayList<>();
        for (int e: bubbleArray) bubbleList.add(new Container(e));
        bs.sort(bubbleList);
        int[] correct = {1,1,1,1,3,3,3,5,5,5};
        String compare1 = bubbleList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void negativeNumbersTestList()
    {
        int[] bubbleArray = {-1,-5,-7,-2,-3,-8,-9,-4,-6,0};
        ArrayList<Container> bubbleList = new ArrayList<>();
        for (int e: bubbleArray) bubbleList.add(new Container(e));
        bs.sort(bubbleList);
        int[] correct = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        String compare1 = bubbleList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void emptyTestList()
    {
        int[] bubbleArray = {};
        ArrayList<Container> bubbleList = new ArrayList<>();
        for (int e: bubbleArray) bubbleList.add(new Container(e));
        bs.sort(bubbleList);
        int[] correct = {};
        String compare1 = bubbleList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }
}
