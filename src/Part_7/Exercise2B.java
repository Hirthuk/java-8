package Part_7;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2B {

    public static void main(String[] args) {
//        Given List<List<Integer>> matrix, flatten to a single stream, filter evens, compute sum.
        List<List<Integer>> nestedList = List.of(List.of(1,2,3,4), List.of(5,6,7));

        int sum = nestedList.stream() // 1. Start a Stream pipeline from the 'nestedList'.
                //    The resulting stream type is Stream<List<Integer>>.

                .flatMap(List :: stream) // 2. Intermediate operation: Flattens the stream of lists into a single stream of integers.
                //    It applies the 'stream()' method reference to each inner List<Integer> and merges the results.
                //    The resulting stream type is Stream<Integer>.
                .filter(integer -> integer % 2 == 0)
                // The following line uses 'mapToInt' to convert the Stream<Integer> to an efficient IntStream.

                .mapToInt(Integer::intValue) // 3. Intermediate operation: Converts a Stream<Integer> (objects) to an IntStream (primitives).
                //    It uses the 'intValue()' method reference to unbox each Integer object into its primitive int value.

                .sum();                      // 4. Terminal operation: Calculates the sum of all elements in the IntStream.
        //    This method is only available on primitive streams (IntStream, LongStream, DoubleStream), not on Stream<Integer>.

        System.out.println(sum); // Prints the final calculated sum. In this specific code, the sum includes all numbers (1+2+3+4+5+6+7) resulting in 28.
    }
}
