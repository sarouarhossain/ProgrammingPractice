package array;

public class MyClass {
    int y;
    double x;

    @Override
    public String toString() {
        return "y: "+y+"\nx: "+x;
    }

    public static void main(String[] args) {
//      int x = 10;
//      String xx = String.valueOf(10);
//      System.out.println(xx);

        MyClass obj = new MyClass();
        obj.y = 15;
        obj.x = 12.0;
        String c = "35";
        System.out.println(Integer.getInteger(c));

//        String objdata = obj.toString();
//        System.out.println(obj.toString());
  }
}
