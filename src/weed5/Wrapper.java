package weed5;

public class Wrapper {
  int a;
  Wrapper(int z) {
    a=z;
  }

    @Override
    public String toString() {
        return String.valueOf(a);
    }
    // int b = 50;
       // Integer z = b;
  }
//        Integer num= new Integer(a);
//
//        Integer x=new Integer(50);
//        int y=x;
//        int y2=x.intValue();

class Wrapper2{
    public static void main(String[] args) {
        Wrapper w=new Wrapper(20);
        System.out.println(w);
    }
}