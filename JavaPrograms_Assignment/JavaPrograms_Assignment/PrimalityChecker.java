package JavaPrograms_Assignment;

import java.util.Scanner;

/**********
 * Check if number is prime *********
 * 
 * @param author *
 * @return "Njoh Noh Prince Junior" *
 *********************************************/

public class PrimalityChecker {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number < 0);
        
        scanner.close();
    }
}
