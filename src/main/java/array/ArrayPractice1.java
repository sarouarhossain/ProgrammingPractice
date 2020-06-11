package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice1 {
  public static void main(String[] args) {
    //
      int[] A = {1,3,4,5,6};
      int t = 0;
      for (int i = 0; i<A.length; i++){
          if(A[i] == 3|| A[i] ==5){
            t = A[i];
            System.out.println(t);
          }
      System.out.println(t);
      }
      // 3,5
      System.out.println(t);

//      for (int a : A) {
//          System.out.println(a);
//      }

      List<Integer> listA = new ArrayList<>();
      listA.add(10);
      listA.add(25);
      listA.add(15);
      listA.add(30);
      listA.add(20);

      for (int i =0; i<listA.size(); i++){
        System.out.println(listA.get(i));
      }

      int tem = 0;
      for (Integer x : listA) {
            if(x == 15 || x == 30){
                tem = x;
            }
          System.out.println(x);
      }

      listA.forEach(x -> System.out.println(x));

      listA.forEach(System.out::println);

    listA.forEach(
        x -> {
          if (x == 15 || x == 30) {
            System.out.println(x);
          }
          System.out.println(x);
        });
  }
}
