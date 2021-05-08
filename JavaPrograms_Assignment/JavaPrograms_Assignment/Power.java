package JavaPrograms_Assignment;

import java.util.Scanner;

/**********
 * Check if number is prime *********
 * 
 * @param author *
 * @return "Njoh Noh Prince Junior" *
 *********************************************/

public class Power {
    public static double power(double base, int exponent) {
        if (exponent == 1)
            return base;
        else
            return base * power(base, exponent - 1); // Using recursion
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
        int exponent;
        System.out.println("Enter a base and an exponent: ");
        base = scanner.nextDouble();
        exponent = scanner.nextInt();
        System.out.println(base + "^" + exponent + ": " + power(base, exponent));
        scanner.close();
    }
}
