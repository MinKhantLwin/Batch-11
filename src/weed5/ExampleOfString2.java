package weed5;

import java.util.StringJoiner;

public class ExampleOfString2 {
    public static void main(String[] args) {
        String a= "Mi";
        String b = "n";
        System.out.println(a.concat(b));
        System.out.println(a+b);

        StringBuilder c= new StringBuilder("Kh");
        StringBuilder d = new StringBuilder("ant");
        System.out.println(c.append(d));

        StringBuilder e=new StringBuilder("Lw");
        StringBuilder f = new StringBuilder("in");
        System.out.println(String.format("%s%s",e,f));

        StringJoiner g = new StringJoiner("and");
        StringJoiner h = new StringJoiner("May");
        System.out.println();
    }
}
