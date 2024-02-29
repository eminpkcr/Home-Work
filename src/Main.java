public class
Main {
    public static void main(String[] args) {

        int sum = 0;
        int number = 1;

        // Use a while loop to add numbers from 1 to 10
        while (number <= 10) {
            sum += number; // Add the current number to the sum
            number++;      // Increment the number
        }

        // Display the sum
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}