package Part_5;

import java.util.function.Function;

public class FunctionFInterface {

    public static void main(String[] args) {
//        Takes input and return output <input Class, Return Class>
        Function<String, Integer> functionFI = (str) -> {
            return str.length();
        };

        int result = functionFI.apply("Sharan");
        System.out.println(result);

//        Function Functional Interface abstract method implementation using method reference as an Example
        Function <String, String> functionFI2 = String :: toUpperCase;

        String upperCase = functionFI2.apply("Sharan Kumar");

        System.out.println(upperCase);
    }

//
}
