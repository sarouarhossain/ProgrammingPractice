package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice6 {
  public static void main(String[] args) {
    //
    //    int[] A = {2, 1, 0, 2, 3, 6, 2, 6};
    //
    //    int x = 2;
    //
    //    int[] B = new int[A.length];
    //    int j = 0;
    //
    //    // scope
    //    for (int i = 0; i < A.length; i++) {
    //      if (x == A[i]) {
    //        B[j] = i; // index of A
    //        j++;
    //      }
    //    }
    //
    //    for (int i = 0; i < j; i++) {
    //      System.out.println(B[i]);
    //    }

    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(3);
    list.add(1);
    list.add(3);
    list.add(9);
    list.add(5);

    Integer x = 3;

    boolean isFound = list.contains(x);
  }
}
