package weed5;

import java.util.Scanner;

public class GMail {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String gmail = user.nextLine();

        //gmail.

        if(gmail.endsWith("@gmail.com")){
            System.out.println(gmail+ "is correct gmail");
        }else {
            System.out.println("Incorrect gmail.");
        }
    }
}
