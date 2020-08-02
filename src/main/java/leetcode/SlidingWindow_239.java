package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class SlidingWindow_239 {
  public static void main(String[] args) {
    //
    int[] nums = {-7, -8, 7, 5, 7, 1, 6, 0};
    int k = 4;

    System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
  }

  public static int[] maxSlidingWindow(int[] nums, int k) {
    int i = 0, j = k, length = nums.length;
    Deque<Integer> window = new ArrayDeque<>();
    List<Integer> resList = new ArrayList<>();

    if (k > length) {
      Integer m = Collections.max(Arrays.stream(nums).boxed().collect(Collectors.toList()));
      resList.add(m);
      return resList.stream().mapToInt(x -> x).toArray();
    } else {
      for (int x = 0; x < k; x++) {
        window.add(nums[x]);
      }
      Integer m = Collections.max(window);
      resList.add(m);
    }

    while (j < length) {
      // System.out.println(window);
      window.pollFirst();
      window.add(nums[j++]);

      Integer m = Collections.max(window);
      resList.add(m);
    }
    // System.out.println(window);
    return resList.stream().mapToInt(x -> x).toArray();
  }
}
