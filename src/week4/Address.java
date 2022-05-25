package week4;

public class Address {
    String city;
    String division;
    String country;
    Address(String c,String d,String c1){
    division = d;
    city = c;
    country = c1;
    }
}
class Employee
{   int id;
    String name;
    Address a;
   Employee(int i,String n,Address a1){
       id = i;
       name = n;
       a = a1;
   }
    void Display(){
        System.out.println(id+"."+name+"("+a.division+","+a.city+","+a.country+")");

    }
   public static void main(String[] args) {
        Address a = new Address("Yangon","Northdagon","Myanmar");
        Employee e = new Employee(1,"Min Khant",a);
        e.Display();
    }
}