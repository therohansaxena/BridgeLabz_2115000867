import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }
}
