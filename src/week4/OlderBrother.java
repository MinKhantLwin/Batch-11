package week4;

interface WorkAtHome{
     void X();
}
    public class OlderBrother implements WorkAtHome{
        public static void main(String[] args) {
        OlderBrother o= new OlderBrother();
        YoungerBrother y=new YoungerBrother(o);
        y.DoIt();
        }
        @Override
        public void X() {
            System.out.println("Wash Rice");
        }
    }
class YoungerBrother{
    WorkAtHome work;
    YoungerBrother(OlderBrother older){work=older;}
    void DoIt(){
        work.X();
    }
}
