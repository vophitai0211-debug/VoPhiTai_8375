package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
        System.out.println(names.get(0));
        System.out.println(names.remove("Huy2"));
        System.out.println(names.remove(1));
        System.out.println(Arrays.toString(names.toArray()));
    }

}
