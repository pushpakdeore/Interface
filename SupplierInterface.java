package pushpak52Interface;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "Hello Generics";
        Supplier<Integer> intSupplier = () -> 100;

        System.out.println(stringSupplier.get());  // Hello Generics
        System.out.println(intSupplier.get());     // 100
    }
}
