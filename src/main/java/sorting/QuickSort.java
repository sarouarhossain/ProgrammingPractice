package sorting;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    //
    int[] A = {5, 7, 6, 9, 4, 8, 1, 2, 3, Integer.MAX_VALUE};
    System.out.println(Arrays.toString(A));
    quickSort(A, 0, A.length - 1);
    System.out.println(Arrays.toString(A));
  }

  public static void quickSort(int[] A, int start, int end) {
    if (start < end) {
      int j = partition(A, start, end);
      quickSort(A, start, j);
      quickSort(A, j + 1, end);
    }
  }

  public static int partition(int[] A, int start, int end) {
    int p = A[start];
    int i = start, j = end;

    do {
      do {
        i++;
        System.out.println(i);
        System.out.println(Arrays.toString(A));
      } while (A[i] <= p);
      do {
        j--;
      } while (A[j] > p);

      if (i < j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
      }

    } while (i < j);

    int temp = A[start];
    A[start] = A[j];
    A[j] = temp;

    return j;
  }
}
