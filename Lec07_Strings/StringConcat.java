package Lec07_Strings;

public class StringConcat {

    public static String concatenateWithPlus(String first, String second) {
        return first + " " + second;
    }

    public static String concatenateWithConcat(String first, String second) {
        return first.concat(" ").concat(second);
    }

    public static void main(String[] args) {
        String original = "Duy Tan";
        String plus = original + " University";
        String add = " University";
        String concat = original.concat(add);
        System.out.println("Using + : " + plus);
        System.out.println("Using concat: " + concat);
        System.out.println("First after concat without reassignment: " + original);

        String first = "Duy Tan";
        String second = "University";
        System.out.println("Using + : " + concatenateWithPlus(first, second));
        System.out.println("Using concat: " + concatenateWithConcat(first, second));
        System.out.println("First after concat without reassignment: " + first);
    }
}
