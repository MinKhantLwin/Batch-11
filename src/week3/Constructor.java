package week3;

public class Constructor {
        Constructor(){
            System.out.println("nnnn");
        }
        Constructor(int a){
            System.out.println(a);
        }

    public static void main(String[] args) {
        Constructor name = new Constructor();
        System.out.println(name);
        Constructor num = new Constructor(9);
    }
}
