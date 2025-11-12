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

        Function<String, String> VerifyNull =
                (str) -> str.length() == 0 ? "Enter a Valid String" : str;

        //    Using andThen to convert to Uppercase and checking is it not Null
//        First Method will be executed post that second method will be executed
        String result1 = VerifyNull.andThen(functionFI2).apply("Upper Case converted using andThen");

        System.out.println(result1);


//        compare function -> Just Opposite to andThen Function..
//        If we apply the same logic as andTHen function above. We just need to reverse the function place
//        Here VerifyNull will be executed first post that functionFI2
        String result3 = functionFI2.compose(VerifyNull).apply("UpperCase using Compose");
        System.out.println("Compose FUnction " + result3);

        //        Identitiy Method
        Function<Integer, Integer> identicalValue = Function.identity();
        int value = identicalValue.apply(100);
        System.out.println(value);



    };



//
}
