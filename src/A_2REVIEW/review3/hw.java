package A_2REVIEW.review3;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of all the numbers is: " + sum);

        scanner.close();
    }
}



