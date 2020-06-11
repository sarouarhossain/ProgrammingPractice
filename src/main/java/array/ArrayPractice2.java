package array;

import java.util.Arrays;

public class ArrayPractice2 {
  public static void main(String[] args) {
    //
    int A[] = {1,2,3,4,5,6};

    int temp = 0;
    for (int i = A.length-1 ; i>=0 ; i--){
        temp = A[i]; // why error ?
    }

    System.out.println(temp); // 1

    // System.out.println(Arrays.toString(A));

      // List diya ultanor try kora
  }
}
