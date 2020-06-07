package stringtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMethodsSplit {
  public static void main(String[] args) {
      String s = "Life is beautiful";
    String[] splitString = s.split(" ");
    String x = splitString[0];
    String y = splitString[1];

    //
    List<String> list = new ArrayList<>();
    for (String st: splitString){
        list.add(st);
    }
    //
    List<String> list1 = Arrays.asList(splitString);

    System.out.println(list1.get(0));

    // iterative way
    for (String st: list1){
      System.out.println(st);
    }

    // print all using lambda
    list.forEach(st -> System.out.println(st));

    // print all using method reference
    list.forEach(System.out::println);

    String[] splitString1 = s.split(" ",2);
    for (String x1: splitString1){
      System.out.println(x1);
    }
  }
}
