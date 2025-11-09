package Part_3;

@FunctionalInterface
public interface FunctionalLambdaInterface {

//    Single Abstract method
    void printName();

//    Can Have multiple default and static methods too still called as functional Interface
    default String printName1(String name){
        return "This is a Default method";
    }
}
