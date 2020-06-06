package sorting.mergesort;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    //
      int[] A = {2,5,8,12,3,6,7,10};
      int h = A.length -1;
      int m = h/2;
      merge(A,0,m,h);
      System.out.println(Arrays.toString(A));
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

//      int q = l;
//      while (q<=h){
//          A[q] = C[q];
//          q++;
//      }
  }
}
