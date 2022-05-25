package week4;

public class Person {
    int age;
    String name;

    Person(int a,String b)
    {
    age = a;
    name = b;
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Person(20,"Khant");
    }
}
