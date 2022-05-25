package week4;

abstract class No2{
    abstract int x();
}
public class Abstract extends No2 {
    @Override
    int x() {
        System.out.println(100);
        return 0;
    }
    public static void main(String[] args) {
        Abstract y = new Abstract();
        System.out.println(y.x());
    }
}