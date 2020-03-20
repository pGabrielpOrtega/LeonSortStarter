package edu.ujcv.progra1;

public class BubleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        bubleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }


        public int[] bubleSort(int[] array){
            for (int i = 0; i < array.length ; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(array[j] > array[i]){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
            return array;
        }
    }

