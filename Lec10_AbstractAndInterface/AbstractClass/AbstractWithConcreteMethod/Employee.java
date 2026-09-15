package Lec10_AbstractAndInterface.AbstractClass.AbstractWithConcreteMethod;

public abstract class Employee {

    private String name = "Tai";

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfor() {
        System.out.println("Name: " + getName());
    }

    abstract double calculateSalary();
}
