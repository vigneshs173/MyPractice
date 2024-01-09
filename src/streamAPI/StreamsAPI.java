package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamsAPI {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        list.stream()
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted(String::compareTo)
            .forEach(System.out::println);
    }
}
