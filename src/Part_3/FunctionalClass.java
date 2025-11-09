package Part_3;

public class FunctionalClass implements FunctionalLambdaInterface{


    @Override
    public void printName() {
        System.out.println("Abstract method called in the class" + this.getClass());
    }

}
