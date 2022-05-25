package week4;
class C{
    int x;
    C(){

    }
    C(int x){
        this.x=x;
    }
}
class C1 extends C{
    C1(){
        System.out.println("Hi");
    }
    C1(int x){

    }
    public static void main(String[] args) {
        C1 x = new C1();
    }
}
public class ConstructorExample {

}
