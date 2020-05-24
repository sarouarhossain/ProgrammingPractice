package sorting;

public class BubbleSort {
  public static void main(String[] args) {
    //
    int A[] = {8, 5, 7, 3, 1};
    int B[] = {1, 3, 5, 7, 8}; // {1,3,5,7,8}
    String C[] = {"Deppok", "Alom", "Barun", "Bony", "Danny"};
    bubbleSortUpdated(C);
    for (String a : C) {
      System.out.println(a);
    }
  }

  // time complexity O(n2)
  static void bubbleSort(int[] A) {
    int n = A.length;
    int counter = 0;
    for (int i = 0; i <= n - 1; i++) {

      for (int j = 0; j < n - 1 - i; j++) {
        counter++;
        if (A[j] > A[j + 1]) {
          int temp = A[j]; // 8
          A[j] = A[j + 1]; // A[0] = 5
          A[j + 1] = temp; // A[1] = 8
        }
      }
    }

    System.out.println("Counter: " + counter);
  }

  // Time complexity O(n2), best case O(n)
  static void bubbleSortUpdated(String[] A) {
    int n = A.length;
    int counter = 0;
    for (int i = 0; i <= n - 1; i++) {

      boolean flag = true;

      for (int j = 0; j < n - 1 - i; j++) {
        counter++;
        if (A[j].compareTo(A[j + 1]) > 0) {
          String temp = A[j]; // 8
          A[j] = A[j + 1]; // A[0] = 5
          A[j + 1] = temp; // A[1] = 8
          flag = false; // swap flg false
        }
      }

      if (flag == true) break;
    }

    System.out.println("Counter: " + counter);
  }
}
