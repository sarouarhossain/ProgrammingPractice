package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice3 {
  public static void main(String[] args) {
    //
      int[] A = {4,2,5,7,8,9,5};
      //         0 1 2 3 4 5 6
      // n = 10 -> output : no
      // n = 7 -> output : yes
      // A.length = 7
      // i = 0 1 2 3 4 5 6 7

      int n = 10;

      boolean flag = false;
      for(int i = 0; i < A.length ; i++){
        if(A[i] == n){
          flag = true;
          break;
        }
      }

      if(flag){
         System.out.println("Data found");
      }else {
         System.out.println("Data not found");
      }


      List<Integer> list = new ArrayList<>();
      list.add(5);
      list.add(2);
      list.add(3);
      list.add(7);
      list.add(9);

      Integer input = 3;
      // A[0] , A[1]
      // A.get(0), A.get(1)

      boolean f = false;
//      for (int i = 0; i<=list.size()-1 ; i++){
//          if (list.get(i).equals(input)){
//              f = true;
//              break;
//          }
//      }

      // list.get(index)
//      for (Integer data : list) {
//          if (data.equals(input)){
//              f=true;
//              break;
//          }
//      }

      int i = 0;
      while (i<list.size()){
          if(list.get(i).equals(input)){
              f = true;
              break;
          }
          i++;
      }

      if (f){
      System.out.println("Found");
      }else {
      System.out.println("Not Found");
      }
  }
}
