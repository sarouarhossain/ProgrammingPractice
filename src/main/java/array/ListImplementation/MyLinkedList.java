package array.ListImplementation;

public class MyLinkedList {
  Node head;

  public void add(Object dataToBeAdded) {
    Node newNode = new Node();
    newNode.data = dataToBeAdded;

    if (head == null) {
      head = newNode;
    } else {
      Node tempNode = head;
      while (tempNode.nextNode != null) {
        tempNode = tempNode.nextNode;
      }

      tempNode.nextNode = newNode;
    }
  }

  public void display() {
    Node tempNode = head;

    while (tempNode.nextNode != null) {
      System.out.print(tempNode.data + " ");
      tempNode = tempNode.nextNode;
    }

    System.out.println(tempNode.data);
  }

  public void remove(Object data) {
    if (head.data.equals(data)) {
      Node tempNode = head;
      head = tempNode.nextNode;
      tempNode = null;
      return;
    }

    Node tempNode = head;
    Node previousNode = null;
    while (!tempNode.data.equals(data)) {
      previousNode = tempNode;
      tempNode = tempNode.nextNode;
    }

    previousNode.nextNode = tempNode.nextNode;
  }
}
