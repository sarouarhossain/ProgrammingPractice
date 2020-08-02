package linkedlist;

public class LeetCode21 {
  public static void main(String[] args) {
    //
    ListNode t3 = new ListNode(4);
    ListNode t2 = new ListNode(2, t3);
    ListNode t1 = new ListNode(1, t2);

    ListNode l3 = new ListNode(4);
    ListNode l2 = new ListNode(3, l3);
    ListNode l1 = new ListNode(1, l2);

    ListNode rs = mergeTwoLists(t1, l1);

    ListNode t = rs;
    while (t.next != null) {
      System.out.println(t.val);
      t = t.next;
    }
    System.out.println(t.val);
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode rt = l1;
    while (l1.next != null && l2.next != null) {
      if (l2.val <= l1.val) {
        ListNode l2t = l2.next;
        ListNode l1t = l1.next;

        l1.next = l2;
        l1.next.next = l1t;
        l2 = l2t;
        l1 = l1.next;
      } else {
        l1 = l1.next;
      }
    }
    return rt;
  }

  private static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
