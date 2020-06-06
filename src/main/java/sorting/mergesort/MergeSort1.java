package sorting.mergesort;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] A = {8,2,9,6,5,3,7,4};
        mergeSort(A,0,A.length-1);
        System.out.println(Arrays.toString(A));
    }

    static void mergeSort(int[] A, int l, int h){
        if(l<h){
            int m = (l+h)/2;
            mergeSort(A,l,m);
            mergeSort(A,m+1,h);
            merge(A,l,m,h);
        }
    }

    static void merge(int[] A, int l, int m, int h){
        int i = l, j= m+1, k = l;
        int[] C = new int[A.length];

        while (i<=m && j<=h){
            if(A[i] < A[j]){
                C[k] = A[i];
                i++;k++;
            }else {
                C[k] = A[j];
                j++;k++;
            }
        }

        while (i<=m){
            C[k] = A[i];
            i++;k++;
        }

        while (j<=h){
            C[k] = A[j];
            j++;k++;
        }

        for (int q = l; q<=h; q++){
            A[q] = C[q];
        }
    }
}
