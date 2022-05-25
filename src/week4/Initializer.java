package week4;

public class Initializer {
    int a;
    String str;
    static String name;
    Initializer()
    {
        System.out.println(a);
    }
    {
       a = 20;
        System.out.println("OK");
    }
    static {
        name = "Khant";
    }
    public static void main(String[] args) {
        new Initializer();
    }
}
