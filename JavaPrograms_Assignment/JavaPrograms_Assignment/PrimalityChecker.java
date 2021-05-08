package JavaPrograms_Assignment;

import java.util.Scanner;

/**********
 * Check if number is prime *********
 * 
 * @param author *
 * @return "Njoh Noh Prince Junior" *
 *********************************************/

public class PrimalityChecker {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number < 0);
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
        scanner.close();
    }
}
