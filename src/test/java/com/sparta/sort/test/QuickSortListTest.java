package com.sparta.sort.test;
import com.sparta.sort.Container;
import com.sparta.sort.QuickSort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortListTest {

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
    public void basicTestList()
    {
        int[] quickArray = {5,6,1,3,0,2,8,7,9,4};
        ArrayList<Container> quickList = new ArrayList<>();
        for (int e: quickArray) quickList.add(new Container(e));
        qs.sort(quickList);
        int[] correct = {0,1,2,3,4,5,6,7,8,9};
        String compare1 = quickList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void duplicateNumbersTestList()
    {
        int[] quickArray = {5,1,3,5,1,3,1,3,5,1};
        ArrayList<Container> quickList = new ArrayList<>();
        for (int e: quickArray) quickList.add(new Container(e));
        qs.sort(quickList);
        int[] correct = {1,1,1,1,3,3,3,5,5,5};
        String compare1 = quickList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void negativeNumbersTestList()
    {
        int[] quickArray = {-1,-5,-7,-2,-3,-8,-9,-4,-6,0};
        ArrayList<Container> quickList = new ArrayList<>();
        for (int e: quickArray) quickList.add(new Container(e));
        qs.sort(quickList);
        int[] correct = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        String compare1 = quickList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void emptyTestList()
    {
        int[] quickArray = {};
        ArrayList<Container> quickList = new ArrayList<>();
        for (int e: quickArray) quickList.add(new Container(e));
        qs.sort(quickList);
        int[] correct = {};
        String compare1 = quickList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

    @Test
    public void stringTestList()
    {
        String[] quickArray = {"c", "a", "b"};
        ArrayList<Container> quickList = new ArrayList<>();
        for (String e: quickArray) quickList.add(new Container(e));
        qs.sort(quickList);
        String[] correct = {"a", "b", "c"};
        String compare1 = quickList.toString();
        String compare2 = Arrays.toString(correct);
        assertEquals(compare1, compare2);
    }

}
