package Part_1;

public class DefaultClass implements defaultInterface{


    @Override
    public void printAbstractMethod() {
        System.out.println("Abstract Method call");
    }

    @Override
    public void printInputAbstract(String name) {

       defaultMethod();
    }

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.defaultMethod();
    }

}
