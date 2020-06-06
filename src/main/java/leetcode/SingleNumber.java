package leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static void main(String[] args) {
    //
      int A[] = {2,1,3,2,3};
      Map<Integer,Integer> map = new HashMap<>();

      for (int x: A ){
          if(map.containsKey(x)){
              int k = map.get(x);
              map.replace(x,++k);
          }else {
              map.put(x,1);
          }
      }

    map.forEach(
        (key, value) -> {
          System.out.println("key:"+key+"  value:"+value);
        });

      Integer res = null;
      for (Map.Entry<Integer,Integer> entry: map.entrySet()){
          Integer key = entry.getKey();
          Integer value = entry.getValue();
          if (value == 1){
              res = key;
              break;
          }
      }

    System.out.println("Result: "+res);
  }
}
