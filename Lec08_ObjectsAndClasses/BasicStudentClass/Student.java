package Lec08_ObjectsAndClasses.BasicStudentClass;

import java.util.Scanner;

public class Student {

    private String studentID;
    private String fullName;
    private String major;

    public Student(String studentID, String fullName, String major) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.major = major;
    }
    public Student(){
    }
    
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ID: ");
        String studentID=scanner.nextLine();
        System.out.print("Enter full name: ");
        String fullName=scanner.nextLine();
        System.out.print("Enter major: ");
        String major=scanner.nextLine();
    }

    public void displayInfor() {
        System.out.println(studentID + " - " + fullName + " - " + major);
    }
}
