package Part_1;

public interface defaultInterface2 {
    default void defaultMethodInterface2(){
        System.out.println("Default method from Interface 2");
    }

    default void sameMethod(){
        System.out.print("Same signature method in Interface 2");
    }


}
