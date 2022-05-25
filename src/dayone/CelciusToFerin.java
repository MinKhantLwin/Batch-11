package dayone;

import java.util.Scanner;

public class CelciusToFerin {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter celcius");
        int a = object.nextInt();
double x = (1.8*a);
        System.out.println(x+32);

    }
}
