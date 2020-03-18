package edu.ujcv.progra1;

import java.util.Arrays;

public class Menu {
    public void xd(){
        // This is unsorted array
        QuickSort qk = new QuickSort();
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

        // Let's sort using quick sort
        qk.quickSort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
    }

