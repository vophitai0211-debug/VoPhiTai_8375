package Lec07_Strings;

import java.util.ArrayList;

public class AddAndRemove {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println("Before: " + names);
        String removedName = names.remove(1);
        System.out.println("Removed: " + removedName);
        System.out.println("After: " + names);
        System.out.println("Size: " + names.size());
    }
}
