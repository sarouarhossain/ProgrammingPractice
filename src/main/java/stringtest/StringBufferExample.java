package stringtest;

public class StringBufferExample {
  public static void main(String[] args) {
    //
      StringBuffer sb = new StringBuffer();
      System.out.println(sb.capacity());
      sb.append("12345678901234567");
      System.out.println(sb.capacity());
  }
}
