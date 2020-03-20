package edu.ujcv.progra1;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        //Llamo a las demás clases
        ShuffleSort s = new ShuffleSort();
        HeapSort heap = new HeapSort();
        QuickSort qk = new QuickSort();
        BubleSort Bub = new BubleSort();

        // aqui pregunto si quiere ser po un arreglo ya hehco o aletorio
        System.out.println("Desea un arreglo desordenado del 1 al 10 sencillo para ver las funciona correctamente \no un arrelgo desordena aletorio");
        int 
        int[] elementos = {3,2,4,5,6,7,9,9,10,3,5};
        Integer[] array = new Integer[] {3,2,4,5,6,7,9,9,10,3,5};


        elementos = s.shuffleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");



        // Let's sort using quick sort
        qk.quickSort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));

    }
}
