package Lec11_Encapsulation.StudentWithAGradeList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student() {
        this.grades = new ArrayList<>();
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getAverage() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.id = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter number of grades to add: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter grade [" + (i + 1) + "] : ");
            double grade = scanner.nextDouble();
            this.addGrade(grade);
        }
    }

    public void display() {
        System.out.println("ID: " + id + "\nName: " + name + "\nGrades: " + grades);
        System.out.printf("Average Grade: %.2f%n", getAverage());
    }
}
