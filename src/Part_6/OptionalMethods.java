package Part_6;

import java.util.Optional;
import java.util.Scanner;

public class OptionalMethods {

    public static void main(String[] args) {
//        Get the UserInput from the Console.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = scanner.nextLine();

//        Creating a Optional Instance with ofNullable meaning that it can be null so it won't throw
//        NullPointer exception. Optional.of(object) will create exception when null.
        Optional<String> userInput = Optional.ofNullable(name);

//      Expects a Predicate Functional Interface as a input
        Optional<String> validUser = userInput.filter((str) -> str.length() > 3);

//        Trim and uppercase using Map function. Map function takes Function FI as an argument - Using method
//        reference here and lambda both for practice. Map return Optional again that can be connected again.
        Optional<String> formattedName = validUser.map((str) -> str.trim()).map(String :: toUpperCase);

//        Using Logic to ifPresentOrElse to send if the value not present
//        This method takes two argument (Consumer FI -takes a value and return nothing) first one logic will be
//        done if present, Second one if not present
        formattedName.ifPresentOrElse(
                str -> System.out.println("Hello, " + str + " 👋"),
                () -> System.out.println("Invalid Name")
        );

//        OrElseGet to set the default value if the value is isEmpty: Returns Supplier FI (no input, return)
//        Just like Get method that return the value of the Optional.. it will verify and set smtg else if not present
        String finalName = formattedName.orElseGet(() -> "Guest");

//        To Throw exception if missing
        try{
            String mustHaveName = formattedName.orElseThrow(
                    () -> new RuntimeException("Name is missing")
            );
            System.out.println(mustHaveName + " MustHaveName");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
