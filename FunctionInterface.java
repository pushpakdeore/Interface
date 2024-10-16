package pushpak52Interface;
import java.util.function.Function;
public class FunctionInterface {
    public static void main(String[] args) {

        Function<Object, String> toStringFunction = obj -> "Converted: " + obj.toString();

        System.out.println(toStringFunction.apply(100));  // Converted: 100
        System.out.println(toStringFunction.apply(true)); // Converted: true
        System.out.println(toStringFunction.apply(45.89));// Converted: 45.89
    }
}
