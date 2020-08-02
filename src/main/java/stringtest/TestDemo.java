package stringtest;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class TestDemo {
  public static void main(String[] args) {
    //
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int x : nums) {
      if (map.containsKey(x)) {
        Integer y = map.get(x);
        map.replace(x, ++y);
      } else {
        map.put(x, 1);
      }
    }

    int s = 0;
    int d = 0;
    for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
      if (entrySet.getValue() > s) {
        s = entrySet.getValue();
        d = entrySet.getKey();
      }
    }

    return d;
  }
}
