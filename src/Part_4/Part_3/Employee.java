package Part_4.Part_3;

public class Employee {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

//    Default constructor
    public Employee() {
        System.out.println("Employee object with no data");
    }

    public Employee(String name) {
        System.out.println("Employee Name is  " + name);
    }
}
