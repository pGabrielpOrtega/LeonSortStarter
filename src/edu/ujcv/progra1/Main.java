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

        // aqui pongo el arreglo aletorio y copie el mismo para las comprobaciones en un nuevo arreglo
        //int[] elementos = {3,2,4,5,6,7,9,9,10,1,3,5};
        int z = 100;
        int[] elementos = new int[z];
        int[] e1 = new int[z];
        Random r = new Random();

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Math.abs(r.nextInt(1000));
        }

        System.arraycopy(elementos,0,e1,0,elementos.length-1);
        //Imprimo el arreglo como se ve
            System.out.println((Arrays.toString(elementos)));
        System.out.println((Arrays.toString(e1)));
        //Imrpimo el tiempo de cada algoritmo
        // Merge
            System.out.println("\n\nMerge Sort tarda "+ m.sort(elementos)+ " milisegundos");

        //heap
            System.out.println("\n\nHeap Sort tarda "+ heap.sort(elementos)+ " milisegundos");

        //Bubble
            System.out.println("\n\nBubble sortarda "+ Bub.sort(elementos)+ " milisegundos");

        //Quick sort
            System.out.println("\n\nQuick Sort tarda "+ qk.sort(elementos)+ " milisegundos");



        int x = leerEntero(sc,"Ingrese El NUMERO .-1 si desea ver que los algoritmos funcionan correctamente, cualquier otro numero para NO ","Error No se reconocio respuesta");
        if(x ==1){
            System.out.println(Arrays.toString(e1));
            System.arraycopy(e1,0,e1,0,elementos.length-1);
            qk.quickSort( e1, 0, elementos.length - 1 );
            System.out.println("Quick sort \n"+Arrays.toString(e1));
        }
        // Let's sort using quick sort


        // Verify sorted array








    }

    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }}
// for (int i = 0; i < elementos.length; i++) {
//   System.out.println(elementos[i]);
// }
//
//elementos = s.shuffleSort(elementos);