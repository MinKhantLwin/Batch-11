package week4;
class User{
    int id;
    String name;
    int amount;

    public User(int i, String n,int a) {
        this.id = i;
        this.name = n;
        this.amount= a;
    }
    void add (int amu){
        amount = amount+amu;
    }
    void show(){
        System.out.println(this.amount);
    }
    void withdraw(int minus){
        amount =  amount-minus;
    }
}
public class ATMCardUser {
    public static void main(String[] args) {
        User user = new User(1,"Khant",10000);
    }

}
