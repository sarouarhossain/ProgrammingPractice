package fundamental;

public class Test {
    String name;
    Integer age;

    Test(){
        System.out.println("Constructor is called");
    }

    static int x=2;
    static {
        System.out.println("TEST"+x);
    }

    public static void main(String[] args){
        System.out.println("Hello");
        Test t = new Test();
    }
}
