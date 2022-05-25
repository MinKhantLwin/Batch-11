package dayone;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner objet = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = objet.nextInt();
        if (a%2==0){
        System.out.println("Even");}
        else {
            System.out.println("Odd");
        }
    }
}
