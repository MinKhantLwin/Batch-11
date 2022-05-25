package dayone;

import java.util.Scanner;

public class Leapnear {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a year");
        int a = object.nextInt();
        if (a%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
