package Review.OExercise2;

import java.util.ArrayList;

public class PersonArrayList {

    private ArrayList<Person> personArrayList = new ArrayList<>();

    public void addPersonInfo(Person person) {
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

    public void updatePersonInfo(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.updatePersonInfo();
            System.out.println("Update complete");
        } else {
            System.out.println("Can't find id");
        }
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personArrayList.remove(person);
            System.out.println("Delete complete");
        } else {
            System.out.println("Can't find id");
        }
    }

    public void displayEveryone() {
        for (Person person : personArrayList) {
            person.displayInfo();
        }
    }

    public void findTeacherByDepartment(String department) {
        boolean find = false;
        for (Person person : personArrayList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    teacher.displayInfo();
                    find = true;
                }
            }
        }
        if (!find) {
            System.out.println("Can't find teacher by department");
        }
    }

    public void countPersonByType() {
        int countStudent = 0;
        int countTeacher = 0;
        for (Person person : personArrayList) {
            if (person instanceof Student) {
                countStudent++;
            }
            if (person instanceof Teacher) {
                countTeacher++;
            }
        }
        if (countStudent == 0 && countTeacher == 0) {
            System.out.println("Not has person");
        } else {
            System.out.println("The number of Students: " + countStudent);
            System.out.println("The number of Teachers: " + countTeacher);
        }
    }
}
