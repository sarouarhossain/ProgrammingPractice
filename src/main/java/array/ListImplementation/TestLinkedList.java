package array.ListImplementation;

public class TestLinkedList {
  public static void main(String[] args) {
    //
    MyLinkedList myLinkedList = new MyLinkedList();

    myLinkedList.add(5);
    myLinkedList.add(3);
    myLinkedList.add(7);
    myLinkedList.add(8);

    myLinkedList.remove(7);
    myLinkedList.display();
  }
}
