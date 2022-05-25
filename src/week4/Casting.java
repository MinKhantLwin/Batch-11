package week4;
class Parent{
    int a=10;
}
public class Casting extends Parent {
    public static void main(String[] args) {
        int a = 20;
        double b; //int>double

        b=a; //Automatic casting/Widening casting
        int c =(int)b; //Narrow casting
        System.out.println(b);
        String name =" Khant";

        Casting z = new Casting(); //Upcasting
        Parent y = new Casting(); //Upcasting==>
        Casting x = (Casting) new Parent(); //DownCasting
    }

}
