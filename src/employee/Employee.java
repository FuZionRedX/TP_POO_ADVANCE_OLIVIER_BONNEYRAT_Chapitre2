package employee;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract double calculateSalary();

    public String describe() {
        return getClass().getSimpleName() + " " + name + " - salaire : " + calculateSalary() + " €";
    }
}
