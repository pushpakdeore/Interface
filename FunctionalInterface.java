package pushpak52Interface;
@java.lang.FunctionalInterface
interface C{
    void show();

}
@java.lang.FunctionalInterface
interface D{
    int add(int i,int j);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        //without parameters
        C obj1 = () -> System.out.println("SHow use");
        obj1.show();
        // with parameters and return type
        D obj2 = (i,j) -> i+j;
        int result = obj2.add(2,5);
        System.out.println(result);
    }

}
