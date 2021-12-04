package com.sparta.sort.test;
import com.sparta.sort.TreeSort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeSortTest {

    private TreeSort ts;
    @BeforeEach
    public void setUp()
    {
        ts = new TreeSort();
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("Another Test completed!");
    }

    @Test
    public void basicTest()
    {
        int[] treeArray = {5,6,1,3,0,2,8,7,9,4};
        ts.sort(treeArray);
        int[] correct = {0,1,2,3,4,5,6,7,8,9};
        String compare1 = Arrays.toString(treeArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void negativeNumbersTest()
    {
        int[] treeArray = {-1,-5,-7,-2,-3,-8,-9,-4,-6,0};
        ts.sort(treeArray);
        int[] correct = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        String compare1 = Arrays.toString(treeArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void emptyTest()
    {
        int[] treeArray = {};
        ts.sort(treeArray);
        int[] correct = {};
        String compare1 = Arrays.toString(treeArray);
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

}
