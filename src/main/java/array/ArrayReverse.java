package array;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    //
      int[] A = {5,3,6,8,9};

      int i=0;
      int j = A.length -1;

      for (int k = 1; k <= A.length/2; k++){
          int t = A[i];
          A[i] = A[j];
          A[j] = t;
          i++;
          j--;
      }

    System.out.println(Arrays.toString(A));
  }
}
