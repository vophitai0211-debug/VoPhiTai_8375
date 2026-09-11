package Lec11_Encapsulation.GetSet;

public class Processor {

    public static void main(String[] args) {
        Student s1 = new Student("Bao", 3);
        Student s2 = new Student();
        s1.display();
        s2.input();
        s2.display();
        System.out.println(Student.count);
        System.out.println("University: " + Student.university);
        Student.hello();
    }
}
