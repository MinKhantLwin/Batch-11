package week3;

class Person1
{
    int age;
    String name;
}
public class Person {
    public static void main(String[] args) {
        Person1 s= new Person1();
        Person1 p=new Person1();
        s.age=9;
        p.name="What";
        System.out.println(s.age);
        System.out.println(p.name);
    }
}
