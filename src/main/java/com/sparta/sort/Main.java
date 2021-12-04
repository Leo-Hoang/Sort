package com.sparta.sort;

public class Main {

    public static void main(String[] args) {
        TreeSort ts = new TreeSort();
        int arr[] = {8,3,7,7,1,1,5,4};
        ts.sort(arr);
        for (int i: arr) System.out.print(i + " ");
        Menu.menu();
    }
}
