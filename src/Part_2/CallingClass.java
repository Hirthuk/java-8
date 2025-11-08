package Part_2;

public class CallingClass {

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();

//        We Can't able to access the static method of the interface by creating an object of the Implemented class
//          Just like default method
//        staticClass.staticMethod() Won't work
//        Can be called with the Interface only
        staticInterface.staticMethod1();

    }
}
