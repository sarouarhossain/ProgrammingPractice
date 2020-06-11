package array;

public class ArrayPractice4 {
  public static void main(String[] args) {
    //
      int[] A = {1,4,2,5,6,7,8};
      // System.out.println(A.length);
//      for (int i =0 ; i < A.length ; i++){
//       System.out.println(A[i]);
//      }

      for (int i = A.length - 1 ; i >= 0 ; i--){
          System.out.println(A[i]);
      }
  }
}
