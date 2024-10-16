package pushpak52Interface;
interface  A{
    void show();
    void run();
}
class B implements A{
    @Override
    public void  show(){
        System.out.println("show");
    }
    @Override
    public void run(){
        System.out.println("Run");
    }

}

public class NoramalInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.run();
        A obje = new A() {
            @Override
            public void show() {
                System.out.println("s");
            }

            @Override
            public void run() {
                System.out.println("r");

            }
        };
        obje.show();

    }
}
