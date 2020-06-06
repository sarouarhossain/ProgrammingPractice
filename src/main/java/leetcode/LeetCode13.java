package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    String s = "III";

    Integer res = 0;
    for (int i = 0; i < s.length(); i++) {
      Integer current = map.get(s.charAt(i));
      Integer next = i < (s.length() - 1) ? map.get(s.charAt(i + 1)) : 0;
      if (current < next) {
        res += (next - current);
        i++;
      } else {
        res += current;
      }
    }
    System.out.println(res);
  }
}
