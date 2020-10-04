import java.util.stream.IntStream;

public class FizzBuzz_ramgsuri {

    public static void main(String args[]){

        IntStream.rangeClosed(1, 100)
                .mapToObj(ifNumberMod(15, "FizzBuzz",
                        ifNumberMod(5, "Buzz",
                                ifNumberMod(3, "Fizz", Integer::toString))))
                .forEach(System.out::println);
    }

    static <R> IntFunction<R> ifNumberMod(int m, R r, IntFunction<R> f) {
        return (int i) -> (i % m == 0) ? r : f.apply(i);
    }
}
