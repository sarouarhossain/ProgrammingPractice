package linkedlist;

import java.util.*;

public class LinkedListDemo {
  public static void main(String[] args) {
    //
    List<Integer> myList = new ArrayList<>();
    myList.add(4);
    myList.add(6);
    myList.add(2);
    myList.add(7);
    myList.add(0);
    myList.add(9);

    // enumurationPrint(myList);
    // iteratorPrint(myList);

    listIterator();
  }

  public static void listIterator() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Lee");
    linkedList.add("Ponting");
    linkedList.add("Heyden");
    linkedList.add("Warne");
    linkedList.add("Gilespe");

    ListIterator iterator = linkedList.listIterator();

    while (iterator.hasNext()) {
      String x = (String) iterator.next();

      if (x.equals("Ponting")) {
        iterator.remove();
      } else if (x.equals("Warne")) {
        iterator.add("Macgrath");
      } else if (x.equals("Heyden")) {
        iterator.set("Gilchrist");
      }
    }
    System.out.println(linkedList);

    while (iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }

    System.out.println(linkedList);
  }

  public static void iteratorPrint(List<Integer> myList) {
    Iterator iterator = myList.iterator();

    while (iterator.hasNext()) {
      Integer x = (Integer) iterator.next();
      if (x % 2 != 0) {
        iterator.remove();
      }
    }

    Iterator iterator1 = myList.iterator();
    while (iterator1.hasNext()) {
      System.out.println(iterator1.next());
    }
  }

  public static void enumurationPrint(List<Integer> myList) {
    Enumeration en = Collections.enumeration(myList);
    while (en.hasMoreElements()) {
      Integer x = (Integer) en.nextElement();
      System.out.println(x);
    }
  }
}
