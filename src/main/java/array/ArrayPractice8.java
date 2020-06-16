package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice8 {
  public static void main(String[] args) {
    //
    int[] A = {0, 3, 1, 4, 2, 6, 8, 5};

    int firstMax;
    int secondMax;

    if (A[0] > A[1]) {
      firstMax = A[0];
      secondMax = A[1];
    } else {
      firstMax = A[1];
      secondMax = A[0];
    }

    for (int i = 2; i < A.length; i++) {
      if (A[i] > firstMax) {
        secondMax = firstMax;
        firstMax = A[i];
      } else if (A[i] < firstMax && A[i] > secondMax) {
        secondMax = A[i];
      }
    }

    System.out.println("firs maximum value:" + firstMax + " second maximum value: " + secondMax);
  }

  public static void test() {
    List<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(3);
    list.add(2);
    list.add(5);
    list.add(7);
    list.add(8);
    list.add(6);

    Integer firstMax;
    Integer secondMax;

    if (list.get(0) > list.get(1)) {
      firstMax = list.get(0);
      secondMax = list.get(1);
    } else {
      firstMax = list.get(1);
      secondMax = list.get(0);
    }

    int i = 2;
    while (i < list.size()) {
      Integer x = list.get(i);
      if (x > firstMax) {
        secondMax = firstMax;
        firstMax = x;
      } else if (x < firstMax && x > secondMax) {
        secondMax = x;
      }
      i++;
    }

    System.out.println("firs maximum value:" + firstMax + " second maximum value: " + secondMax);
  }
}
