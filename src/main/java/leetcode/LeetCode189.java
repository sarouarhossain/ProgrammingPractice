package leetcode;

public class LeetCode189 {
  public static void main(String[] args) {
    //
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int k = 4;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

    for (int x : nums) {
      System.out.println(x);
    }
  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
