package daytwo;

import java.util.Arrays;

public class ForEachEx {
    public static void main(String[] args) {
//        int []a= new int[5];
//        for (int i : a) {
//            System.out.println(i);
//        }
   int num[][]= {
           {1,2,5,7,12},
           {2,9,11,6,8},
           {6,5,4,3,2}
                        };
   int a= num.length;

        //System.out.println(a);
       // System.out.println(num[2][4]);
        for (int i = 0; i <3 ; i++)
        {
            for(int j=0; j<5 ; j++)
            {
                System.out.print(num[i][j] +",");
            }
            System.out.println("");

        }

        for (int x[] : num)
        {
            for (int y : x)
            {
                System.out.print(y +",");
            }
            System.out.println("");
        }
    }
}
