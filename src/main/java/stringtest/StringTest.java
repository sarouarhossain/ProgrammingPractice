package stringtest;

public class StringTest {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1==s2); // false
    System.out.println(s1.equals(s2)); // true
    System.out.println("Test: "+s1==s2); // false

    String s3 = "Hello";
    System.out.println(s1 == s3); // false
    System.out.println(s1.equals(s3)); //true

    byte[] b = {97,98,99,100};
    String s4 = new String(b);
    System.out.println(s4);

    char[] c = {'A','B','C'};
    String s5 = new String(c);
    System.out.println(s5);
  }
}
