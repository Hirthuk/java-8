package Part_7;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1B {
    public static void main(String[] args){
//        Create an infinite stream of random integers (0-99), take first 10 unique values, collect to list.

//        ThreadLocalRandom.current().nextInt(100) will create random numbers of 100 numbers with in 0 to 99

//        Initialize stream with generate() function.. Take supplier FI -> No input no return
        Stream<Integer> random100Numbers = Stream.generate(() -> ThreadLocalRandom.current().nextInt(100));

//        Will generate randomly continously
//        random100Numbers.forEach(value -> System.out.println(value));

        List<Integer> list = random100Numbers.distinct().limit(10).collect(Collectors.toList());

        System.out.println(list);
//      Java 11 Feature
//        This will throw error : stream in Java can only be consumed (operated upon by a terminal operation) once.
//Create new stream instance for that do again.
//        random100Numbers.distinct().limit(10).toList().forEach(System.out :: println);


    }
}
