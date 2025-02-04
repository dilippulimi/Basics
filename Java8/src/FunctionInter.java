public class FunctionInter {

    public static void main(String[] args) {
        Intro intro = System.out::println;
        intro.print("hello world");
    }
}

@FunctionalInterface
interface Intro{

    void print(String str);

    default void createInstance(int instance){
        System.out.println("instance created are "+instance);
    }

    static void imporoveInstance(int instance){
        System.out.println("instance set to "+instance);
    }

}