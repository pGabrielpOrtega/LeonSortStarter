package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        if(i < a.length){
            System.arraycopy(a,i,c,k,c.length - k);
        }else{
            System.arraycopy(b,j,c,k,c.length - k);
        }
        return  c;
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int[] inf = new int[arr.length/2];
        int[] sup = new int[arr.length - inf.length];

        System.arraycopy(arr,0,inf,0,inf.length);
        System.arraycopy(arr,inf.length,sup,0,sup.length);

        return merge(mergeSort(inf),mergeSort(sup));

    }


}
