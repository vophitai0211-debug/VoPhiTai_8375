package Lec06_ArrayArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherQuestion {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = console.nextInt();
        double[] temps = new double[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextDouble();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", average);
        System.out.println("\n" + count + " days above average");

        System.out.println("Emperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}
