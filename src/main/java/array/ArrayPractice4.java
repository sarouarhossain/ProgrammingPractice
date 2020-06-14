package array;

import java.util.Arrays;

public class ArrayPractice4 {
  public static void main(String[] args) {
    //
      int[] A = {1,4,2,5,6,7,8};
      int size = A.length;
      int[] B = new int[size]; // extra array

      int j = 0;

      System.out.println(Arrays.toString(A));

      for (int i = size-1; i >= 0; i--){
          B[j] = A[i];
          j++;
      }

      for (int k = 0; k<size ; k++){
          A[k] = B[k];
      }

      System.out.println(Arrays.toString(A));
  }
}
