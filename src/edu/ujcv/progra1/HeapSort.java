package edu.ujcv.progra1;

import java.util.PriorityQueue;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }
    public void heapSort(int [] array){
        int n = array.length;
        for (int i = n/2-1; i >= 0; i--) {
            Flotar(array, n, i);

        }
        for (int i = n-1; i >=0; i--) {

            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            Flotar(array,i,0);
        }
    }

    public void Flotar(int [] arr,int n, int i) {

        int padre = i;
        int hijoIzquierdo = i * 2 + 1;
        int hijoDerecho = i * 2 + 2;
        if (hijoIzquierdo < n && arr[hijoIzquierdo] > arr[padre]) {
            padre = hijoIzquierdo;
        }

        if (hijoDerecho < n && arr[hijoDerecho] > arr[padre]) {
            padre = hijoDerecho;
        }

        if (padre != i) {

            int temp = arr[i];
            arr[i] = arr[padre];
            arr[padre] = temp;

            Flotar(arr, n, padre);
        } }}


