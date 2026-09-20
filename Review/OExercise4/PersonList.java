package Review.OExercise4;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personArrayList = new ArrayList<>();

    public void addPerson(Person person) {
        personArrayList.add(person);
    }

    public Person findPersonById(String id) {
        for (Person person : personArrayList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void updatePerson(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.updatePerson();
            System.out.println("Update person information completed!");
        } else {
            System.out.println("Error! Can't find person to Update");
        }
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personArrayList.remove(person);
            System.out.println("Delete person information completed!");
        } else {
            System.out.println("Error! Can't find person to delete");
        }
    }

    public void displayEveryone() {
        for (Person person : personArrayList) {
            person.displayInfo();
        }
    }
    public void checkBookBorrowing() {
        if (personArrayList.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        for (Person person : personArrayList) {
            System.out.print("ID: " + person.getId() + " - Name: " + person.getFullName() + " -> ");
            if (person.isBookOverdue()) {
                System.out.println("Overdue");
            } else {
                System.out.println("No overdue");
            }
        }
    }
    public void findTeachersByDepartment(String department) {
        boolean found = false;
        for (Person person : personArrayList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    teacher.displayInfo();
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No teacher found in department: " + department);
        }
    }
}
