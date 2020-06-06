package sorting.mergesort;

import java.util.Arrays;

public class Merging {
  public static void main(String[] args) {
      // MethodArea -> static, global
      // heap -> all objects
      // stack [method area] -> function (local data)
      int[] A = {2,10,18,20};
      int[] B = {4,9,19,25,30};
      int m = A.length;
      int n = B.length;
      int[] C;
      C = merge(A,B,m,n);
      System.out.println(Arrays.toString(C));
  }

  static int[] merge(int[] A, int[] B, int m, int n){
      int i=0,j=0,k=0;
      int[] C = new int[m+n];

      while (i<m && j<n){
          if(A[i] < B[j]){
              C[k] = A[i];
              i++;k++;
          }else {
              C[k] = B[j];
              j++;k++;
          }
      }

      while (i<m){
          C[k] = A[i];
          i++;k++;
      }

      while (j<n){
          C[k] = B[j];
          j++;k++;
      }

      return C;
  }
}
