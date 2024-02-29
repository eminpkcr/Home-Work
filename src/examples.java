import java.util.Scanner;

public class examples {

        public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            System.out.println("Enter 3 numbers:");

            // Loop to get 10 numbers from the user
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter number " + i +   ": ");
                int number = scanner.nextInt();
                sum += number; // Add the entered number to the sum
            }

            // Display the sum of all entered numbers
            System.out.println("The sum of all entered numbers is: " + sum);

            scanner.close(); // Close the scanner object
        }
}