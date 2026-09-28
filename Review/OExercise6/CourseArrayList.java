package Review.OExercise6;

import java.util.ArrayList;

public class CourseArrayList {

    private ArrayList<Course> courses = new ArrayList<>();

    void addCourseToArrayList(Course course) {
        courses.add(course);
    }

    Course findCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public void updateCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equalsIgnoreCase(id)) {
                course.updateCourse();
                System.out.println("Course updated successfully!");
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void deleteCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equalsIgnoreCase(id)) {
                courses.remove(course);
                System.out.println("Course removed successfully!");
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found");
            return;
        }
        for (Course course : courses) {
            course.displayDetails();
        }
    }

    public void displayAvailableCourses() {
        boolean found = false;
        for (Course course : courses) {
            if (course.isAvailable()) {
                course.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available courses");
        }
    }

    public double calculateTotalFees() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Course course : courses) {
            sum += course.calculateTotalFee();
        }
        return sum;
    }
}
