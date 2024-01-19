package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI {
    public static void main(String[] args) {
//
//        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
//        list.stream()
//                .filter(s -> s.startsWith("c"))
//                .map(String::toUpperCase)
//                .sorted(String::compareTo)
//                .forEach(System.out::println);


        int[] arr = {11,44,22,77,55,77,89,90};
        String[] arr2 = {"aaa","sss","fsf", "kljjf"};

//        Arrays.stream(arr).forEach(s -> System.out.println(s));
        Stream<Object> att=Arrays.stream(arr2).map(a->a.toUpperCase());
        System.out.println(Arrays.toString(att.toArray()));
    }
}
