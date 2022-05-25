package weed5;

public class ExampleOfString {
    String str = "Hello";
    String str1 = new String("Hello");
    char[] chars = {'a', 'b', 'c'};
    String str3 = new String(chars);
}
class Example2{
    public static void main(String[] args) {
        String a = "Hi";
        String b = "Hii";
        String c = new String("Hi");
        String d = new String("Bye");
        System.out.println(a.equals(b));
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.compareTo(b));
    }
}
