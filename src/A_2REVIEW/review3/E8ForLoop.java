package A_2REVIEW.review3;

import java.util.Scanner;

public class E8ForLoop {

    public static void main(String[] args) {

        //for loop used when we know in advance how many times we want to repeat block of code

        for (int i = 1; i < 5; i++) {

            System.out.println(i);
        }
        /*
        You need to ask user to enter 10 numbers
        Inside loop we need to calculate the sum of all entered numbers
         */

        Scanner scan = new Scanner(System.in);
        int sum = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("enter number " + i + ": ");
            int num = scan.nextInt();
            sum += num;

        }
        System.out.println("the sum is: " + sum);
        scan.close();


    }
}
