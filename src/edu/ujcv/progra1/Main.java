package edu.ujcv.progra1;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    }
}



	/* // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea agregar el Shuffle Sort");
        int y = sc.nextInt();

        //Llamo a las demás clases
        ShuffleSort s = new ShuffleSort();
        HeapSort heap = new HeapSort();
        QuickSort qk = new QuickSort();
        BubleSort Bub = new BubleSort();
        MergeSort m = new MergeSort();

        // aqui pongo el arreglo aletorio y copie el mismo para las comprobaciones en un nuevo arreglo
        System.out.println("Cuantos elelemente en arreglo desea");
        int z = sc.nextInt(); // z es el numero del tamaño del arreglo
        int[] elementos = new int[z];
        int[] e1 = new int[z];
        Random r = new Random();

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Math.abs(r.nextInt(1000)); //este es numero de numeros
        }

        System.arraycopy(elementos,0,e1,0,elementos.length-1);
        //Imprimo el arreglo como se ve

        System.out.println("El Arreglo es \n"+Arrays.toString(elementos));
        //Imrpimo el tiempo de cada algoritmo

        // Merge
            System.out.println("\nMerge Sort tarda "+ m.sort(elementos)+ " milisegundos");

        //heap
            System.out.println("\nHeap Sort tarda "+ heap.sort(elementos)+ " milisegundos");

        //Bubble
            System.out.println("\nBubble sortarda "+ Bub.sort(elementos)+ " milisegundos");

        //Quick sort
            System.out.println("\nQuick Sort tarda "+ qk.sort(elementos)+ " milisegundos");
        //ShuffleSort
        if(y==1){
            System.out.println("\nShuffle Sort tarda "+ s.sort(elementos)+ " milisegundos");}
    }
}*/

        /*System.out.println("Desea ver si los algoritmos funcioan correctamente");
        int x = sc.nextInt();
        if(x ==1){
            //aqui copío los arreglos
            int[] e2 = new int[z];
            System.arraycopy(e1,0,e2,0,elementos.length-1);

            int[] e3 = new int[z];
            System.arraycopy(e1,0,e3,0,elementos.length-1);

            int[] e4 = new int[z];
            System.arraycopy(e1,0,e4,0,elementos.length-1);

            int[] e5 = new int[z];
            System.arraycopy(e1,0,e5,0,elementos.length-1);

            System.out.println("El Arreglo origiinal \n"+Arrays.toString(e1));

            //Compruebo si funcionan
            qk.quickSort( e1, 0, elementos.length - 1 );
            System.out.println("Quick sort \n"+Arrays.toString(e1));

            e2 = m.mergeSort(e2);
            System.out.println("\nMerge Sort \n"+Arrays.toString(e2));


            heap.heapSort(e3);
            System.out.println("\n Heap Sort \n"+Arrays.toString(e3));

            Bub.bubleSort(e4);
            System.out.println("\nBubble Sort \n"+Arrays.toString(e4));
if(y==1){
            e5 = s.shuffleSort(e5);
            System.out.println("\nShuffle Sort \n"+Arrays.toString(e5));}
        }
    }

   }

// for (int i = 0; i < elementos.length; i++) {
//   System.out.println(elementos[i]);
// }
//
//elementos = s.shuffleSort(elementos);
//int[] elementos = {3,2,4,5,6,7,9,9,10,1,3,5};*/