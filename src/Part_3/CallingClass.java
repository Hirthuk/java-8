package Part_3;

public class CallingClass {



    public static void main(String[] args){
        FunctionalClass functionalClass = new FunctionalClass();
        functionalClass.printName();
//        We can create object like this too, but We can able to access only the FunctionalLambdaInterface methods
//        Not Necessarily have to do like this for Implementation. Just a way to create object
//        FunctionalLambdaInterface fl = new FunctionalClass();

//        Calling the Functional Interface abstract method using Lambda expression
//
        String sharan = "Sharan";
//      Syntax to create Lambda Expression
        FunctionalLambdaInterface lambda = () -> {
            System.out.println("Lambda Expression");
        };
//
        FunctionalLambdaInterface lambda2 = () -> {
            System.out.println("Lambda Expression 2");
        };

        lambda.printName();
        lambda2.printName();



//        Calling default method with the Lambda instance - Anyway It is an  Instance of the Interface  right
        String s = lambda.printName1(sharan);
        System.out.println(s);
    }

}
