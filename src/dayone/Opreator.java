package dayone;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Opreator {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = object.nextInt();
        System.out.println("Enter second Number");
        int b = object.nextInt();
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter your operator");
       String op= operator.nextLine();
        switch (op){
            case "+" :
                int c=a+b;
                System.out.println("Answer is : " +c);
                break;
            case "-" :
                int d=a-b;
                System.out.println("Answer is : " +d);
                break;
            case "*":
                System.out.println("Answer is : "  + a*b);
                break;
            case "/":
                System.out.println("Answer is : " + a/b);
                break;
        }
    }
}