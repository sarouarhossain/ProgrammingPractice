package leetcode;

public class Test {
  public static void main(String[] args) {
    String[] A = {"A", "B"};

//    int left = 0, right = A.length-1;
//    while (left<right){
//        char temp = A[left]; // temp = A[0] = H
//      System.out.println(left); // 0
//      A[left++] = A[right]; // A[0] = A[4] = O
//
//      System.out.println(left); // 1
//
//      A[right--] = temp; // A[4] = temp = H
//      System.out.println(right); // 3
//    }

      // j--;
      // j = j -1
      // j -= 1

      int n = A.length/2;
      int j = A.length -1;
      for (int i =0; i<n; i++){
          String temp = A[i];
          A[i] = A[j];
          A[j] = temp;
          j -= 1;
      }
  }
}
