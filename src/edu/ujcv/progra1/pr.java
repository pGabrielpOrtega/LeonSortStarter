package edu.ujcv.progra1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class pr {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pr d = new pr();
        System.out.println("Cuantos elementos en el arreglo desea ");
        int z = sc.nextInt(); // z es el numero del tamaño del arreglo
        //System.out.println("\nCantidad de numero para el random xd ");
        int cv = 10000;//sc.nextInt();
        int[] elementos = new int[z];
        int[] elementos2 = new int[z];
        int[] elementos3 = new int[z];
        Random r = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Math.abs(r.nextInt(cv));
            elementos2[i] = Math.abs(r.nextInt(cv));
            elementos3[i] = Math.abs(r.nextInt(cv));
        }
        System.out.println("El Arreglo origiinal \n" + Arrays.toString(elementos));
        System.out.println("\nEl Arreglo origiinal \n" + Arrays.toString(elementos2));
        System.out.println("\nEl Arreglo origiinal \n" + Arrays.toString(elementos3));
        System.out.println("Desea agregar la función de comprobar si funcionan correctamente \n1.-Si");
        int com = sc.nextInt();
        System.out.println("\nQue Algoritmo desea ver");
        int leermenu = 2;
        do {
            System.out.println("\n1.- Heap Sort\n2.- Merge Sort \n3.- Quick Sort \n4.- Bubble Sort\n5.- Shuffle Sort");
            int palanca = sc.nextInt();
            int[] e2 = new int[z];
            System.arraycopy(elementos, 0, e2, 0, elementos.length);
            int[] e3 = new int[z];
            System.arraycopy(elementos2, 0, e3, 0, elementos.length);
            int[] e4 = new int[z];
            System.arraycopy(elementos3, 0, e4, 0, elementos.length);
            switch (palanca) {
                case 1:
                    d.heap(e2, e3, e4,com);

                    break;
                case 2:
                    d.mer(e2, e3, e4,com);

                    break;
                case 3:
                    d.Quick(e2, e3, e4,com);

                    break;
                case 4:
                    d.Buble(e2, e3, e4,com);

                    break;
                case 5:
                    d.Shuffle(e2, e3, e4,com);

                    break;
            }
        } while (leermenu != 1);
    }





    public void heap(int[] arr,int[]arr2,int[] arr3,int com){
        HeapSort heap = new HeapSort();
        long t1= heap.sort(arr); long t2= heap.sort(arr2); long t3= heap.sort(arr3);
        System.out.println("\nHeap Sort tarda \nprimer tiempo .- "+ t1+" milisegundos" +"\nSegndo tiempo .- "+ t2 + " milisegundos" +"\nTercer tiempo .- "+ t3 + " milisegundos");
        long promedio = (t1 +t2+t3)/3;
        System.out.println("El promedio es .-"+promedio);
        if(com==1){
        System.out.println("\n Heap Sort \n"+ Arrays.toString(arr)); System.out.println("\n Heap Sort \n"+ Arrays.toString(arr2)); System.out.println("\n Heap Sort \n"+ Arrays.toString(arr3));}
    }

    public void mer(int[] arr,int[]arr2,int[] arr3,int com){
        MergeSort m = new MergeSort();
        long t1= m.sort(arr); long t2= m.sort(arr2); long t3= m.sort(arr3);
        System.out.println("\nMerge Sort tarda \nprimer tiempo .- "+ t1+" milisegundos" +"\nSegndo tiempo .- "+ t2 + " milisegundos" +"\nTercer tiempo .- "+ t3 + " milisegundos");
        long promedio = (t1 +t2+t3)/3;
        System.out.println("El promedio es .-"+promedio);
        if(com==1){
        arr = m.mergeSort(arr); arr2 = m.mergeSort(arr2); arr3 = m.mergeSort(arr3);
        System.out.println("\nMerge Sort \n"+Arrays.toString(arr)); System.out.println("\nMerge Sort \n"+Arrays.toString(arr2)); System.out.println("\nMerge Sort \n"+Arrays.toString(arr3));}
    }

    public void Quick(int[] arr,int[]arr2,int[] arr3,int com){
        QuickSort qk = new QuickSort();
        long t1= qk.sort(arr);
        long t2= qk.sort(arr2);
        long t3= qk.sort(arr3);
        long promedio = (t1 +t2+t3)/3;
        System.out.println("\nQuick Sort tarda \nprimer tiempo .- "+ t1+" milisegundos" +"\nSegndo tiempo .- "+ t2 + " milisegundos" +"\nTercer tiempo .- "+ t3 + " milisegundos");
        System.out.println("El promedio es .-"+promedio);
        if(com==1){
        System.out.println("\nQuick Sort \n"+Arrays.toString(arr));
        qk.quickSort( arr, 0, arr.length-1);
        qk.quickSort( arr2, 0, arr.length-1);
        qk.quickSort( arr3, 0, arr.length-1);
        System.out.println("\nQuick Sort \n"+Arrays.toString(arr)); System.out.println("\nQuick Sort \n"+Arrays.toString(arr2)); System.out.println("\nQuickSort \n"+Arrays.toString(arr3));}
    }

    public void Buble(int[] arr,int[]arr2,int[] arr3,int com){
        BubleSort bub = new BubleSort();
        long t1= bub.sort(arr); long t2= bub.sort(arr2); long t3= bub.sort(arr3);
        long promedio = (t1 +t2+t3)/3;
        System.out.println("\nBubble Sort tarda \nprimer tiempo .- "+ t1+" milisegundos" +"\nSegndo tiempo .- "+ t2 + " milisegundos" +"\nTercer tiempo .- "+ t3 + " milisegundos");
        System.out.println("El promedio es .-"+promedio);
        if(com==1){
        bub.bubleSort(arr);bub.bubleSort(arr2);bub.bubleSort(arr3);
        System.out.println("\nBubble Sort \n"+Arrays.toString(arr)); System.out.println("\nBubble Sort \n"+Arrays.toString(arr2));System.out.println("\nBubble Sort \n"+Arrays.toString(arr3));}
    }

    public void Shuffle(int[] arr,int[]arr2,int[] arr3,int com){
        ShuffleSort s = new ShuffleSort();
        long t1= s.sort(arr); long t2= s.sort(arr2); long t3= s.sort(arr3);
        long promedio = (t1 +t2+t3)/3;
        System.out.println("\nShuffle Sort tarda \nprimer tiempo .- "+ t1+" milisegundos" +"\nSegndo tiempo .- "+ t2 + " milisegundos" +"\nTercer tiempo .- "+ t3 + " milisegundos");
        System.out.println("El promedio es .-"+promedio);
        if(com==1){
        arr = s.shuffleSort(arr); arr2 = s.shuffleSort(arr2); arr3 = s.shuffleSort(arr3);
        System.out.println("\nShuffle Sort \n"+Arrays.toString(arr));System.out.println("\nShuffle Sort \n"+Arrays.toString(arr2));System.out.println("\nShuffle Sort \n"+Arrays.toString(arr3));}
    }
}


