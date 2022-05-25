package weed5;

public class SubStringExample {
    public static void main(String[] args) {
        String a = "Min Khant";
        System.out.println(a.substring(4));
        System.out.println(a.substring(0,3));

        String[]b= "My name is Min Khant Lwin".split(" ");
        System.out.println(b[3]);
        System.out.println(b.length);
    }
}
