package stringtest;

public class StringTest1 {
  public static void main(String[] args) {
    String s1 = new String("Life is beautiful");
    String s2 = new String("Life is beautiful");
    System.out.println(s1 == s2);

    String s3 = "Life is beautiful";
    System.out.println(s1 == s3);

    String s4 = "Life is beautiful";
    System.out.println(s3 == s4);

    String s5 = "Life " + "is beautiful";
    System.out.println(s4 == s5);

    String s6 = "Life ";
    String s7 = s6 + "is beautiful";
    System.out.println(s4 == s7);

    final String s8 = "Life ";
    String s9 = s8 + "is beautiful";
    System.out.println(s4 == s9);
  }
}
