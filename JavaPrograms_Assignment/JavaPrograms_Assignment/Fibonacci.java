package JavaPrograms_Assignment;

import java.util.Scanner;

/**********
 * Check if number is prime *********
 * 
 * @param author *
 * @return "Njoh Noh Prince Junior" *
 *********************************************/

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number < 0);
        System.out.println("Fibnacci(" + number + "): " + fibonacci(number));
        scanner.close();
    }
}