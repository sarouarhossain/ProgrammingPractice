package sorting;

public class SelectionSort {
  public static void main(String[] args) {
    //
      int A[] = {8,6,3,2,5,4,7};
      selectionSort(A);

      for (int x: A){
      System.out.println(x);
      }
  }

    /**
     * Complexity O(n^2)
     * @param A
     */
  public static void selectionSort(int A[]){
      int n = A.length;
      for (int i = 0; i<n-1;i++){
          int k = i;
          for (int j = k+1; j<= n-1; j++){
              if(A[k]>A[j]){
                  k = j;
              }
          }
          int temp = A[i];
          A[i] = A[k];
          A[k] = temp;
      }
  }
}
