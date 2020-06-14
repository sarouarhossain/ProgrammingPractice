package array;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray1 {
  public static void main(String[] args) {
      int[][] A = {{1,0,3},{2,1,2},{9,2,1}};
      //
//      int[][] B = new int[4][3];
//
//      System.out.println(B.length);
//      System.out.println(B[0].length);


//      for (int[] R: A) {
//          for (int data : R) {
//             System.out.print(data+" ");
//          }
//          System.out.println();
//      }


//        int r = 0;
//        while (r<A.length){
//
//            int c = 0;
//            while (c < A[0].length){
//                System.out.print(A[r][c]+" ");
//                c++;
//            }
//            System.out.println();
//
//            r++;
//        }


      List<List<Integer>> twoDList = new ArrayList<>();
      List<Integer> R1 = new ArrayList<>();
      R1.add(1);
      R1.add(2);
      R1.add(3);

      List<Integer> R2 = new ArrayList<>();
      R1.add(4);
      R1.add(5);
      R1.add(6);

      List<Integer> R3 = new ArrayList<>();
      R1.add(7);
      R1.add(8);
      R1.add(9);

      twoDList.add(R1);
      twoDList.add(R2);
      twoDList.add(R3);

//      for (List<Integer> R: twoDList) {
//          for (Integer data : R) {
//            System.out.print(data+" ");
//          }
//      }

      Integer r = 0;
      while (r<twoDList.size()){
          List<Integer> R = twoDList.get(r);

          Integer c = 0;
          while (c < R.size()){
            System.out.println(R.get(c));
            c++;
          }

          r++;
      }

  }
}
