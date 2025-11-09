package Part_4.Part_2;

public class Employee {

    private int id;
    private String name;
    private String email;
    private int salary;

//    Static method to verify the Employee is Valid. This method will be referenced for the Functional Interface
//    abstract method Implementation

    static boolean validEmployee(Employee employee){
        if(employee.getName() != null && employee.getId() != 0) {
            return true;
        }
        return false;
    }

//    Instance method reference
    boolean returnSalaryMethod() {
        if(this.getSalary() > 0){
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
