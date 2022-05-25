package week4;
class A{
    A x(){return this;} //new A()
}
class B {
    B y(){return this;} //new B()
}
public class CoVarient {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.x());
        System.out.println(obj1.getClass().getName());

        B obj2 = new B();
        System.out.println(obj2.y().getClass().getName());
    }
}
