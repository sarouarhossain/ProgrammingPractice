package array;

public class ArrayPractice5 {
  public static void main(String[] args) {
    //  Write a Java program to find the maximum and minimum value of an array
      int[] inputArray = {4,5,2,3,8,9};

      int size = inputArray.length;

      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i<size ; i++){
          if(min > inputArray[i]){
              min = inputArray[i];
          }

          if(max < inputArray[i]){
              max = inputArray[i];
          }
      }

    System.out.println("Min: "+min);
    System.out.println("Max: "+max);
  }
}
