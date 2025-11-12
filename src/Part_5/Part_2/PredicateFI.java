package Part_5.Part_2;

import java.util.function.Predicate;

public interface PredicateFI {

//    Predicate Functional Interface takes one argument and return boolean value
    public static void main(String[] args) {

        Predicate<Integer> ageCheck = e -> e >= 21;
        System.out.println(ageCheck.test(21));
        if(ageCheck.test(21)) {
            System.out.println("You are qualified");
        }
        else {
            System.out.println("Age is less than 18");
        }

//        Using Custom class as a Input
        Employee e1 = new Employee();
        e1.setName("Sharan");
        e1.setSalary(25000);

        Predicate<Employee> checkSalary = e -> e.getSalary() > 21000;

        if(checkSalary.test(e1)) {
            System.out.println(e1.getName() + " is E2 Band");
        }
        else{
            System.out.println(e1.getName() + " is E1 Band");
        }

//        and Default function in predicate
//        Check Name should be Sharan and salary should be higher than 21000
        Predicate<Employee> nameCheck = e -> e.getName().equalsIgnoreCase("sharan");
        boolean NameSalaryCheck = checkSalary.and(nameCheck).test(e1);
        System.out.println("And Default function in Predicate " + NameSalaryCheck);

//        Or default function
//        Name can be Sharan or salary is more than 21k
        boolean NameOrSalaryCheck = checkSalary.or(nameCheck).test(e1);
        System.out.println("OR Default function in Predicate " + NameOrSalaryCheck);

//        negate -> Just the opposite -> !
        boolean notSharanEmployee = checkSalary.negate().test(e1);
        System.out.println("Negate default method in Predicate " + notSharanEmployee);

//        isEquals static function in Predicate Functional Interface
//        Just creating one String Object and passing it as reference
        String s = new String("Sharan");
        Predicate<String> isEqualCheck = Predicate.isEqual(s);
//        Not Required but for example of object reference created this
        String t = "Shar";
        boolean isEqualResult = isEqualCheck.test("Sharan");

        System.out.println("Using isEqual function to compare object equality  " + isEqualResult);

//        Implement using Custom isEquals function using
        Predicate<Employee> isEqualsSalaryEqual = Predicate.isEqual(e1);

        Employee e2 = new Employee();
        e2.setName("Sharan");
        e2.setSalary(23000);

        boolean isEqualSalaryResult = isEqualsSalaryEqual.test(e2);
//      equals method overridden based on salary requirement
        System.out.println("Using isEqual function to compare Salary equality  " + isEqualSalaryResult);
    }
}
