package edu.ujcv.progra1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] elementos = {3,2,4,5,6,7,9,9,10,3,5};
        ShuffleSort s = new ShuffleSort();
        elementos = s.shuffleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");
        QuickSort qk = new QuickSort();
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

        // Let's sort using quick sort
        qk.quickSort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
}
