package week3;


public class Method5 {
    int age;
    String name;
    void sss(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    public static void main(String[] args)
    {
        Method5 m=new Method5();
        m.sss(20,"Min Khant");
        System.out.println(m.age);
        System.out.println(m.name);
    }
}
