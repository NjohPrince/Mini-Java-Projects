package JavaPrograms_Assignment;

import java.util.Scanner;

/**********
 * GoldBag Checker *********
 * 
 * @param author *
 * @return "Njoh Noh Prince Junior" *
 *********************************************/

public class GoldbagChecker {
    public static int[] checkGoldbag(int num) {
        if (num < 4 || num % 2 != 0) {
            return null;
        }
        for (int i = 2; i < num; i++) {
            for (int j = 2; j < num; j++) {
                /*********
                * Making use of the isPrime method within the PrimalityChecker class
                *********/
                if (PrimalityChecker.isPrime(i) && PrimalityChecker.isPrime(j) && i + j == num) {
                    /****** Store the two numbers within an array ******/
                    int[] resultant_array = { i, j };
                    /****** Return the resultant array ******/
                    return resultant_array;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a positive number: ");
        number = scanner.nextInt();
        /****** Case of number < 4 or odd number, simply print null ******/
        if (checkGoldbag(number) == null) {
            System.out.println(checkGoldbag(number));
        } /****** Else print the array returned from the method checkGoldbag() ******/
        else {
            System.out.println("Resultant numbers: " + checkGoldbag(number)[0] + ", " + checkGoldbag(number)[1]);
        }
        scanner.close();
    }
}
