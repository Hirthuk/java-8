package Part_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitializtion {
    public static void  main(String[] args) {

//        Initializing using Collection Object -> Creating Stream Object/Instance
        List<String> names = List.of("Sharan","Thippu","Priyan");
        Stream<String> stream = names.stream();

//        Initializing using Array of Value -> Creating Stream Object/Instance
        String[] names1 = {"Sharan","Thippu","Priyan"};
        Stream<String> stream2 = Arrays.stream(names1);

//        Using Stream Methods
//        Of Method
        Stream<String> stream3 = Stream.of("Sharan","Thippu","Priyan");

//        Using generate stream method
//        Takes Supplier FI as an argument
        Stream<String> stream4 = Stream.generate(() -> "Sharan");

//        Using Builder method -> This will create build design pattern.. from that build pattern we can
//        create the stream. Static method of Stream Interface
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> stream5 = streamBuilder.add("Sharan").add("Thippu").build();

//        Creating a Empty Stream instance
        Stream<String> stream6 = Stream.empty();

    }
}
