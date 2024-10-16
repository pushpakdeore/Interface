package pushpak52Interface;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<Object> isNotNull = obj -> obj != null;

        System.out.println(isNotNull.test("Hello")); // true
        System.out.println(isNotNull.test(null));    // false

        Predicate<Integer> isPositive = num -> num > 0;

        System.out.println(isPositive.test(10)); // true
        System.out.println(isPositive.test(-5)); // false
    }
}
