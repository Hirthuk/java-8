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

//        Using Custom class a Input
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
    }
}
