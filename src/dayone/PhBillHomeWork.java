package dayone;

import java.util.Scanner;

public class PhBillHomeWork {
    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        System.out.println("Enter code Number *979#a to Get Start.");
        String codeX = code.nextLine();
        if (codeX.equals("*979#a")) {
            System.out.println("Packages");

            int num1 = 1;
            System.out.println(num1 + ".Internet Package");
            int num2 = 2;
            System.out.println(num2 + ".Voice Package");
            int num3 = 3;
            System.out.println(num3 + ".Message Package");
            int num4 = 4;
            System.out.println(num4 + ".HtawBi Package");
            int num5 = 5;
            System.out.println(num5 + ".YuHtar Package");

            Scanner internet = new Scanner(System.in);
            System.out.println("Choose a number.");
            int x = internet.nextInt();
            if (x == num1) {
                System.out.println("Choose a package you want to buy.");
                int Number1 = 1;
                System.out.println(Number1 + ".299MB=699Ks");
                int Number2 = 2;
                System.out.println(Number2 + ".499MB=999Ks");
                int Number3 = 3;
                System.out.println(Number3 + ".999MB=1599Ks");
                Scanner packagechoice1 = new Scanner(System.in);
                int xx = packagechoice1.nextInt();
                System.out.println("Operation Success.We will send Message to Your Phone for Detail.Thank You for Your Purchase.");
            } else if (x == num2) {
                System.out.println("Choose a package you want to buy");
                int Number1 = 1;
                System.out.println(Number1 + ".60min=699Ks");
                int Number2 = 2;
                System.out.println(Number2 + ".90min=999Ks");
                int Number3 = 3;
                System.out.println(Number3 + ".120min=1599Ks");
                int Number4 = 4;
                System.out.println(Number4 + ".200min=2099Ks");
                Scanner packagechoice2 = new Scanner(System.in);
                int xx = packagechoice2.nextInt();
                System.out.println("Operation Success.We will send Message to Your Phone for Detail.Thank You for Your Purchase");
            } else if (x == num3) {
                System.out.println("Choose a package you want to buy.");
                int Number1 = 1;
                System.out.println(Number1 + ".300SMS=699Ks");
                int Number2 = 2;
                System.out.println(Number2 + ".600SMS=999Ks");
                int Number3 = 3;
                System.out.println(Number3 + ".30Days Free SMS=1599Ks");
                Scanner packagechoice1 = new Scanner(System.in);
                int xx = packagechoice1.nextInt();
                System.out.println("Operation Success.We will send Message to Your Phone for Detail.Thank You for Your Purchase.");
            } else if (x == num4) {
                System.out.println("Choose a package you want to buy.");
                int Number1 = 1;
                System.out.println(Number1 + ".HtawBi 2xMoney");
                int Number2 = 2;
                System.out.println(Number2 + ".HtawBi 5xMoney");
                int Number3 = 3;
                System.out.println(Number3 + ".HtawBi 10xMoney");
                Scanner packagechoice1 = new Scanner(System.in);
                int xx = packagechoice1.nextInt();
                System.out.println("Operation Success.We will send Message to Your Phone for Detail.Thank You for Your Purchase.");
            } else if (x == num5) {
                System.out.println(".How much did You want to loan.");
                int Number1 = 1;
                System.out.println(Number1 + ".800Ks(+99Ks for Service.)");
                int Number2 = 2;
                System.out.println(Number2 + ".1500Ks(+199Ks for Service.)");
                Scanner packagechoice1 = new Scanner(System.in);
                int xx = packagechoice1.nextInt();
                System.out.println("Operation Success.We will send Message to Your Phone for Detail.Thank You for Your Purchase.");
            }

        } else {
            System.out.println("Wrong Code number.");
        }

    }


}
