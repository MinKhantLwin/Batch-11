package week4;

public class Inheritance {
    int num = 5 ;
}
class Inheritance2 extends Inheritance{
    int num2 = 10;

    public static void main(String[] args) {
        Inheritance2 x = new Inheritance2();
        System.out.println(x.num + x.num2);
    }
}