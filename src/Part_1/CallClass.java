package Part_1;

public class CallClass {

    //        Option-1 Override the method
//    public static void sameMethod() {
//        System.out.println("Same method is created here to manage compile time error");
//    }

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();

        defaultClass.defaultMethod();
        defaultClass.printAbstractMethod();
//        Calling Other Interface default methods
        defaultClass.defaultMethodInterface2();

//        Calling Interface methods with same method signature
        //defaultClass.sameMethod(); //This will throw the compile time error. Not sure which Interface method to choose
//        sameMethod();

//        Option -2 If you want to call that method only in Interface
//          Check it in the Implemented Class.
        defaultClass.sameMethod();


    }
}
