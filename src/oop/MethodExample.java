package oop;

public class MethodExample {
    void show() {
        System.out.println("method is working");
    }
    static void display() {
        System.out.println("ssss");
    }
    public static void main(String[] args) {
        display();
        MethodExample m= new MethodExample();
        m.show();
        int b = m.show1();
        System.out.println(b);
        System.out.println(m.show1());
    }
    int show1()
    {
        return 1;
    }
}
