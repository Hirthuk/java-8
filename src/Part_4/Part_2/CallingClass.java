package Part_4.Part_2;

import Part_4.MethodReferenceInterface;

import java.lang.reflect.Member;

public class CallingClass {

    public static void main(String[] args) {
//        Implemented the FI abstract method and passing the Employee Class method as a method reference
        staticMethodReferenceInterface staticMethodReferenceInterface = Employee :: validEmployee;

//        Creating an Empty Employee Class object.. BY default fields of the class is null so valid employee wil
//        be false

        Employee employee = new Employee();
//        Let's create a valid User
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Sharan");
        employee1.setSalary(100);
        System.out.println(staticMethodReferenceInterface.isValidUser(employee)); //false
        System.out.println(staticMethodReferenceInterface.isValidUser(employee1)); //false

//        Implemented the FI abstract method and passing the Employee Class method as a Instance method reference
        Employee e = new Employee();
//        We can directly call the Instance method without Object creation only when the Class method doesn't have
//        any argument
        InstanceMethodReference instanceMethodReference = Employee :: returnSalaryMethod;
        System.out.println(instanceMethodReference.returnSalary(employee1));

    }
}
