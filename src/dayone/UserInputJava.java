package dayone;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class UserInputJava {
    public static void main(String[] args) {


        Scanner object = new Scanner(System.in);
        System.out.println("your number");
        int a = object.nextInt();
        System.out.println(a);
    }

}
