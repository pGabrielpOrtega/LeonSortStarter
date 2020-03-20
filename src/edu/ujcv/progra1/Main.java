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
        MergeSort m = new MergeSort();

        // aqui pregunto si quiere ser po un arreglo ya hehco o aletorio
        int[] elementos = {3,2,4,5,6,7,9,9,10,1,3,5};

        //Imprimo el arreglo como se ve
        System.out.println((Arrays.toString(elementos)));
        //Imrpimo el tiempo de cada algoritmo
        //Merge
        System.out.println("\n\ntarda "+ m.sort(elementos)+ " milisegundos");
//heap
        System.out.println("\n\ntarda "+ heap.sort(elementos)+ " milisegundos");
//Bubble
        System.out.println("\n\ntarda "+ Bub.sort(elementos)+ " milisegundos");
        //Quick sort
        System.out.println("\n\ntarda "+ qk.sort(elementos)+ " milisegundos");

        // Let's sort using quick sort
        qk.quickSort( elementos, 0, elementos.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(elementos));







    }
}
// for (int i = 0; i < elementos.length; i++) {
//   System.out.println(elementos[i]);
// }
//
//elementos = s.shuffleSort(elementos);