package Review.OExercise6;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseArrayList manager = new CourseArrayList();

        while (true) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add an Online Course");
            System.out.println("2. Add an Offline Course");
            System.out.println("3. Update a course by ID");
            System.out.println("4. Delete a course by ID");
            System.out.println("5. Display all courses");
            System.out.println("6. Display courses open for enrollment (Available)");
            System.out.println("7. Calculate total fees for all courses");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    OnlineCourse onlineCourse = new OnlineCourse();
                    onlineCourse.addCourse();
                    manager.addCourseToArrayList(onlineCourse);
                    break;
                }
                case 2: {
                    OfflineCourse offlineCourse = new OfflineCourse();
                    offlineCourse.addCourse();
                    manager.addCourseToArrayList(offlineCourse);
                    break;
                }
                case 3: {
                    System.out.print("Enter Course ID to update: ");
                    String id = scanner.nextLine();
                    manager.updateCourseById(id);
                    break;
                }
                case 4: {
                    System.out.print("Enter Course ID to delete: ");
                    String id = scanner.nextLine();
                    manager.deleteCourseById(id);
                    break;
                }
                case 5: {
                    System.out.println("\nDISPLAY ALL COURSES");
                    manager.displayAllCourses();
                    break;
                }
                case 6: {
                    System.out.println("\nAVAILABLE COUSES");
                    manager.displayAvailableCourses();
                    break;
                }
                case 7: {
                    double total = manager.calculateTotalFees();
                    System.out.printf("Total fee for all courses: %.2f\n", total);
                    break;
                }
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please choose from 1 to 8.");
            }
        }
    }
}
