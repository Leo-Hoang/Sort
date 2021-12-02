package com.sparta.sort.test;

import com.sparta.sort.QuickSort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {

    private QuickSort qs;
    @BeforeEach
    public void setUp()
    {
        qs = new QuickSort();
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("Another Test completed!");
    }

    @Test
    public void basicTest()
    {
        int[] quickArray = {5,6,1,3,0,2,8,7,9,4};
        quickArray = qs.sort(quickArray);
        int[] correct = {0,1,2,3,4,5,6,7,8,9};
        String compare1 = Arrays.toString(quickArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void duplicateNumbersTest()
    {
        int[] quickArray = {5,1,3,5,1,3,1,3,5,1};
        quickArray = qs.sort(quickArray);
        int[] correct = {1,1,1,1,3,3,3,5,5,5};
        String compare1 = Arrays.toString(quickArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void negativeNumbersTest()
    {
        int[] quickArray = {-1,-5,-7,-2,-3,-8,-9,-4,-6,0};
        quickArray = qs.sort(quickArray);
        int[] correct = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        String compare1 = Arrays.toString(quickArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void emptyTest()
    {
        int[] quickArray = {};
        quickArray = qs.sort(quickArray);
        int[] correct = {};
        String compare1 = Arrays.toString(quickArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

}
