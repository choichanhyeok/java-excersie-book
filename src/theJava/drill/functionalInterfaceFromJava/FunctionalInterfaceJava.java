package theJava.drill.functionalInterfaceFromJava;
import java.util.function.Function;

public class FunctionalInterfaceJava{
    public static void run(){
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        Function<Integer, Integer> plus10Andmultiply2 = plus10.andThen(multiply2);

        System.out.println(plus10Andmultiply2.apply(2)); // (2 + 10) * 10 = 120
    }
}