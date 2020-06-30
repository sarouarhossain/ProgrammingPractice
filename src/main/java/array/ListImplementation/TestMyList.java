package array.ListImplementation;

public class TestMyList {
  public static void main(String[] args) {
    //
    MyList<Integer> myList = new MyList<>();

    System.out.println("Before remove: ");
    myList.add(5);
    myList.add(3);
    myList.add(6);
    myList.add(1);
    myList.add(3);
    myList.add(8);

    myList.displayList();

    myList.remove(6);

    System.out.println("After remove: ");
    myList.displayList();
  }
}
