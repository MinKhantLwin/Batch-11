package week4;

public class Overriding {
    int sum(int a){
        return a+a;
    }
}
class Overriding2 extends Overriding{
    @Override
    int sum(int a) {
        return super.sum(a);
    }

    public static void main(String[] args) {
        Overriding2 x=new Overriding2();
        System.out.println(x.sum(3));
    }
}
