package pushpak52Interface;


import java.util.function.Consumer;

public class ConsumerInterface {
    public static <T> void consumeInpit(T input){
        Consumer<T> consume =(value) -> System.out.println(value);
        consume.accept(input);
    }

    public static void main(String[] args) {
        consumeInpit("idfhj");
        consumeInpit(33);
        consumeInpit(true);

    }
}

