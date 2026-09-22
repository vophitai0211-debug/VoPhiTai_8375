package Review.OExercise2;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonArrayList personList = new PersonArrayList();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1.Add new student/teacher");
            System.out.println("2.Update person by id");
            System.out.println("3.Delete person by id");
            System.out.println("4.Display all students and teachers");
            System.out.println("5.Find teachers by department");
            System.out.println("6.Count the number of students and teacher individually");
            System.out.println("0.Exit");
            System.out.println("Choose option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Choose 1.Student, 2.Teacher");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        Student student = new Student();
                        student.addPersonInfo();
                        personList.addPersonInfo(student);
                        System.out.println("Add student complete");
                    } else if (choice == 2) {
                        Teacher teacher = new Teacher();
                        teacher.addPersonInfo();
                        personList.addPersonInfo(teacher);
                        System.out.println("Add student complete");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter id to update person");
                    String updateId = scanner.nextLine();
                    personList.updatePersonInfo(updateId);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter id to delete person");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                case 4:
                    System.out.println("---DISPLAY ALL---");
                    personList.displayEveryone();
                    break;
                case 5:
                    System.out.println("Enter department to find teacher");
                    String department = scanner.nextLine();
                    personList.findTeacherByDepartment(department);
                    break;
                case 6:
                    System.out.println("The number of Students and Teachers individually: ");
                    personList.countPersonByType();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 0);
        scanner.close();
    }
}
