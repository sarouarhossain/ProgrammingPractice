package numberConversion;

import java.util.Arrays;

public class NumberConversion {
  public static void main(String[] args) {
    //
//      int x = 97;
//      int output[] = convertDecimalToBinary(97);
//      System.out.println(Arrays.toString(output));
      char[] x = {'1','1','0','0','0','0','1'};
      int res = convertBinaryToDecimal(x);
      System.out.println(res);
  }

  public static int convertBinaryToDecimal(char[] x){
      int size = x.length;
      int i = size-1;
      int k = 0;
      int dec = 0;
      while (k<size){
          char t = x[k];
          int y = Character.getNumericValue(t);
          dec += y * Math.pow(2,i);
          i--;
          k++;
      }

      return dec;
  }

  public static int[] convertDecimalToBinary(int n){
      int A[] = new int[1000];
      int i = 0;
      while (n>0){
          int t = n%2;
          A[i] = t;
          n = n/2;
          i++;
      }

      int B[] = new int[i];
      int size = i;
      for (int j = 0; j<size; j++){
          i--;
          B[j] = A[i];
      }

      return B;
  }
}
