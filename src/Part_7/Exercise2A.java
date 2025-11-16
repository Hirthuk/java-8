package Part_7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2A {
//    From List<String> words, get distinct words of length >3, sort by length desc, collect to list.
    public static void main(String[] args) {

        List<String> words = List.of("Sharan", "Software", "Thip", "Thippu","Priyan" , "ICI");
//        This will sort the elements in the natural order.. We want in reverse order - custom Logic required
        List<String> result = words.stream().filter(str -> str.length() > 3).distinct().sorted().collect(Collectors.toList());

//        sorted takes Comparator Interface as an argument, and we can make use of the methods based on data type.

        List<String> reverseResult = words.stream().filter(str -> str.length() > 3).distinct()
                        .sorted(Comparator.comparingInt(String :: length).reversed()).collect(Collectors.toList());
//        result.forEach(str -> System.out.println(str));
        reverseResult.forEach(str -> System.out.println(str));

//        max(Comparator) -> Takes Comparator as an argument
    }
}
