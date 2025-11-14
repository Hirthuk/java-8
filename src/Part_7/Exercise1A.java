package Part_7;

import java.util.List;
import java.util.stream.Stream;

public class Exercise1A {
    public static void main(String[] args) {
//        Given a List<String> names, print names that start with 'S' in uppercase.

        List<String> names = List.of("Sharan", "Santhosh", "Thippu");

        Stream<String> nameStream = names.stream();

        nameStream.filter((str) -> str.startsWith("S")).map(String :: toUpperCase).forEach(
                (str) -> System.out.println(str)
        );
    }
}
