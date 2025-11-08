package Part_1;

public interface defaultInterface {

    void printAbstractMethod();
    void printInputAbstract(String name);

    default void defaultMethod() {
        System.out.println("Default method Called");
    }

    default String defaultStringMethod (){
        return "Default method with String data type called";
    }
}
