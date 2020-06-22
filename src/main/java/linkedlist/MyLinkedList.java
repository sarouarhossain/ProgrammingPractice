package linkedlist;

public class MyLinkedList {
  Node head;
  int counter = 0;
  /**
   * Add function
   *
   * @param data
   */
  public void add(Object data) {
    Node newNode = new Node();
    newNode.data = data; // data add to the node object

    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;

      while (temp.next != null) { // temp -> next jodi null na hoy
        temp = temp.next; // temp r moddhe poroborti node niye nilam
      }

      temp.next = newNode;
    }

    counter++;
  }

  /** Display function */
  public void display() {
    Node temp = head;

    while (temp.next != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

    System.out.println(temp.data);
  }

  /**
   * get size of the list
   *
   * @return
   */
  public int size() {
    return counter;
  }
}
