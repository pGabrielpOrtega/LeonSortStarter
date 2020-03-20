package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public int[] mergeSort(int[] a) {

        int[] inf = new int [a.length/2];
        int[] sup = new int [a.length - inf.length];
        int k =0;

        if(a.length <= 1){
            return a;
        }

        for (int i = 0; i < inf.length; i++) {

            inf [i] = a [k++];

        }

        for (int i = 0; i < sup.length; i++) {

            sup[i]= a[k++];
        }


        return merge(mergeSort(inf),mergeSort(sup));
    }

    public static int[] merge(int[] inf, int[] sup ){

        int [] retval = new int [inf.length + sup.length];

        int i = 0, j = 0, k = 0;

        for (  ; j < inf.length && k < sup.length; i++) {

            if (inf[j] < sup[k]) {

                retval[i] = inf[j++];

            } else {

                retval[i] = sup[k++];
            }

        }

        if (j < inf.length){
            for ( ; i < retval.length; i++) {
                retval[i] = inf[j++];
            }
        }else if (k < sup.length){
            for (; i < retval.length ; i++) {
                retval[i] = sup[k++];

            }

        }

        return retval;
    }


}
