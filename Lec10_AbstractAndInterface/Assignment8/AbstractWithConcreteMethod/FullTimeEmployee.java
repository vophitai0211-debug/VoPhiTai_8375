package Lec10_AbstractAndInterface.Assignment8.AbstractWithConcreteMethod;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }
}
