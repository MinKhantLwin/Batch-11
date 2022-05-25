package oop;

public class Methods {
   static int number(){
        int a=7;
        return a;
    }
  static String letter(){
        String s="Method";
        return s;
    }
     static void Display(){
        System.out.println(number());
       System.out.println(letter());
    }

    public static void main(String[] args) {
        Display();
    }
}
