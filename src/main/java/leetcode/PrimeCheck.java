package leetcode;

import java.util.Arrays;

public class PrimeCheck {
  public static void main(String[] args) {
    //

    int[] result = getPrimes(1000000);
    System.out.println(Arrays.toString(result));
  }

  public static int[] getPrimes(int input) {
    boolean[] tempArray = new boolean[input + 1];
    Arrays.fill(tempArray, true);
    tempArray[0] = false;
    tempArray[1] = false;

    for (int i = 2; i * i <= input; i++) {
      if (!tempArray[i]) continue;

      if (tempArray[i]) {
        for (int j = i * i; j < input; j = j + i) {
          tempArray[j] = false;
        }
      }
    }

    int count = 0;
    for (int i = 2; i <= input; i++) {
      count = tempArray[i] ? count + 1 : count;
    }

    int[] primeList = new int[count];
    int indexOfPrimeList = 0;
    for (int i = 2; i <= input; i++) {
      if (tempArray[i]) {
        primeList[indexOfPrimeList++] = i;
      }
    }

    return primeList;
  }

  public static boolean isPrime(int n) {
    int limit = (int) Math.sqrt(n);
    for (int i = 2; i <= limit; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
