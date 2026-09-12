package Lec11_Encapsulation.StudentWithAGradeList;

public class Processor {

    public static void main(String[] args) {
        Student student1 = new Student("S01", "Vo Phi Tai");
        student1.addGrade(3.52);
        student1.addGrade(2.45);
        student1.addGrade(3.78);
        student1.display();
        Student student2 = new Student();
        student2.addInfo();
        student2.display();
    }
}
