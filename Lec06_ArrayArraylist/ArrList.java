package Lec06_ArrayArraylist;

import java.util.ArrayList;

public class ArrList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Chan");
        names.add("Bo");
        names.add("May");
        names.add("De");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("Number of elements = " + names.size());
    }
}
