package Part_4;

public class CallingClass {


    public static void main(String[] args) {
        //    Implementing the Functional Interface abstract method with Lambda Expression

        MethodReferenceInterface methodReferenceInterface = (String value) -> {
            System.out.println("Converting the String to Uppercase with the Lambda expression");
            return value.toUpperCase();
        };

        String result = methodReferenceInterface.convertToToUpperCase("Sharan Kumar");


        System.out.println(result);

//        Using Method reference -> We are using the Method of the class inside the Lambda Expression
//        String.toUpperCase -> for Using the predefine method of the Java classes or custome classes we can
//        Simply call the method reference like below

        MethodReferenceInterface methodReferenceInterface1 = String :: toUpperCase;
        System.out.println(methodReferenceInterface1.convertToToUpperCase("Sharankumar"));
    }
}
