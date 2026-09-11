package Lec11_Encapsulation.GetSet;

import java.util.Scanner;

public class Student {

    private String studentID;
    private float gpa;

    public static String university = "VN-US";
    public static int count;

    public Student() {
        count++;
    }

    public Student(String studentID, float gpa) {
        this.studentID = studentID;
        this.gpa = gpa;
        count++;
    }

    public float getGpa() {
        return gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        String studentID2 = scanner.nextLine(); //dung set de nhap vao bang cach gan du lieu
        setStudentID(studentID2);
        System.out.print("Enter gpa: ");//dung set de nhap vao truc tiep bien private
        setGpa(scanner.nextFloat());
    }

    public void display() {
        System.out.println("Student ID: " + getStudentID() + "\nGpa: " + getGpa());
    }

    public static void hello() {
        System.out.println("Hello VN-US");
    }
}
