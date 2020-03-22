package edu.ujcv.progra1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class pr {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pr d = new pr();
        int z = sc.nextInt(); // z es el numero del tamaño del arreglo
        int[] elementos = new int[z];

        for (int i = 0; i < elementos.length; i++) {
            Random r = new Random();
            elementos[i] = Math.abs(r.nextInt(1000)); //este es numero de numeros
        }
        System.out.println("El Arreglo origiinal \n"+Arrays.toString(elementos));
        d.x(elementos);
    }
    public void x(int[] arr){
        HeapSort heap = new HeapSort();
        //heap
        System.out.println("\nHeap Sort tarda "+ heap.sort(arr)+ " milisegundos");
        heap.heapSort(arr);
        System.out.println("\n Heap Sort \n"+ Arrays.toString(arr));
    }
}
