package Part_6;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> details = getName();

        if(details.isPresent()) { //isPresent check if the value is present or null
//            Get Method returns the value with the class datatype we mention
            System.out.println(details.get().toUpperCase());
        }

    }

    public static Optional<String> getName() {
//        Of Method is used to instantiate the Optional class with the Class type we mention
        Optional<String> detail = Optional.of("Using Optional class to avoid possible Null values");
        return detail;
    }
}
