package Part_4.Part_3;

public class CallingClass {

    public static void main(String[] args) {
        ConstructerReferenceFInterface constructerReferenceFInterface = Employee :: new;

//        Constructor is referenced.
        constructerReferenceFInterface.returnEmployeeName("Sharan");
    }
}
