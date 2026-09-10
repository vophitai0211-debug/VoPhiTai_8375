package Lec08_ObjectsAndClasses.BasicStudentClass;

public class StudentClassDemo {

    public static void main(String[] args) {
        Student s1 = new Student("S001", "An Nguyen", "IT");
        Student s2 = new Student("S002", "Binh Tran", "SE");
        s1.displayInfor();
        s2.displayInfor();
        Student s3 = new Student();
        s3.input();
        s3.displayInfor();
    }
}
