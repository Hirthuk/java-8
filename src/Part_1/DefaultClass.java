package Part_1;

public class DefaultClass implements defaultInterface, defaultInterface2{


    @Override
    public void printAbstractMethod() {
        System.out.println("Abstract Method call");
    }

    @Override
    public void printInputAbstract(String name) {

       defaultMethod();
    }

    public void defaultMethod(){
        System.out.println("Overriden the default method of the Interface in DefaultClass");
    }

//    This Methods can only be called inside an overridden method of the sameMethod in the Interface implemented class\
    public void sameMethod(){
        defaultInterface.super.sameMethod();
        defaultInterface2.super.sameMethod();
    }

//    public static void main(String[] args) {
//        DefaultClass defaultClass = new DefaultClass();
//        defaultClass.defaultMethod();
//    }

}
