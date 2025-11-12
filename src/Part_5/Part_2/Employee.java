package Part_5.Part_2;

public class Employee {

    @Override
    public  boolean equals(Object a){
        Employee e = (Employee) a;
        return this.getSalary() == e.getSalary();
    }

    private int id;
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
