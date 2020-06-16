package array;

import java.util.HashSet;

public class ArrayPractice7 {
  public static void main(String[] args) {
    //
    Integer[] A = {5, 3, 4, 6, 7, 5, 3};

    HashSet<Integer> set = new HashSet<>();

    Integer[] dup = new Integer[A.length];
    int k = 0;

    for (int i = 0; i < A.length; i++) {
      if (!set.add(A[i])) {
        dup[k++] = A[i];
      }
    }

    for (int i = 0; i < k; i++) {
      System.out.println(dup[i]);
    }
  }
}
