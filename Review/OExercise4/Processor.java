package Review.OExercise4;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonArrayList personList = new PersonArrayList();
        int option;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find teachers by department");
            System.out.println("7. Check book return due date");
            System.out.println("0. Exit");
            System.out.println("===========================");

            System.out.print("Choose option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Student student = new Student();
                    student.addPerson();
                    personList.addPerson(student);
                    System.out.println("Add student successfully!");
                    break;

                case 2:
                    Teacher teacher = new Teacher();
                    teacher.addPerson();
                    personList.addPerson(teacher);
                    System.out.println("Add teacher successfully!");
                    break;

                case 3:
                    System.out.print("Enter person id to update: ");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                    break;

                case 4:
                    System.out.print("Enter person id to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;

                case 5:
                    personList.displayEveryone();
                    break;

                case 6:
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    personList.findTeachersByDepartment(department);
                    break;

                case 7:
                    System.out.println("\n===== BOOK RETURN STATUS =====");
                    personList.checkBookBorrowing();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }
}