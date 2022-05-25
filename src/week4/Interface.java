package week4;
interface I{
    String xx();
    default void yy(){}
}
class Z {
    public static void main(String[] args) {
        new I(){

            @Override
            public String xx() {
                return null;
            }

            @Override
            public void yy() {
                I.super.yy();
            }
        };
    }
}
public interface Interface{

}
