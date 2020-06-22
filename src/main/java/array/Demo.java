package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
  public static void main(String[] args) {
    //
    int[] C = {3, 2, 1, 5};
    List<Integer> myList = Arrays.stream(C).boxed().collect(Collectors.toList());
    //    System.out.println(myList);
    //
    //    for (Integer x : myList) {
    //      if (x.equals(2)) {
    //        System.out.println(x);
    //      }
    //    }

    //    int i = 0;
    //    while (i < myList.size()) {
    //      if (myList.get(i) == 2) {
    //        int myLastValue = myList.get(i);
    //        System.out.println(myLastValue);
    //      }
    //      i++;
    //    }

    List<Integer> myList2 = new ArrayList<>();

    for (int x : C) {
      myList2.add(x);
    }

    System.out.println(myList2);
  }
}
