package Lec06_ArrayArraylist;

public class ArrAndFor {

    public static void main(String[] args) {
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println( );
    }
}
