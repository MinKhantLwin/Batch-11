package week4;

public class OverridingTest {
   float result(String x){
        return x.length();
    }

    public static void main(String[] args) {
        String y="encapsulation";
OverridingTest z = new OverridingTest();
        System.out.println(z.result(y));
    }
}