package daytwo;

public class LargestNumber {
    public static void main(String[] args) {
        int x []={3,219798,4,5,13,534,51,55,123,5};
        int y=x[0];
       for (int i=1;i<9;i++)
       {
           if(y<x[i])
           {
              y=x[i];
           }
       }
       System.out.println(y);
    int []num3=x.clone();

        System.out.println(num3[0]);
    }
}
