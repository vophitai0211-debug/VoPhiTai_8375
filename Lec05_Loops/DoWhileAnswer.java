/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec05_Loops;

import java.util.Scanner;

/**
 *
 * @author tai
 */
public class DoWhileAnswer {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        double number;
        do {
            System.out.println("Enter a number (-1 to quit): ");
            number = console.nextInt();
            sum += number;
        } while (number != -1);
        System.out.println("The total is " + sum);
    }
}
