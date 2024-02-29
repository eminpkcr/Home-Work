package class8;

import java.util.Scanner;

public class E3ForLoop {
    public static void main(String[] args) {


        // write a loop to add all the even numbers from 1 to 30

         int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                sum += i;           //adding all the even numbers to the sum variable one by one
            }
        }
        System.out.println(sum);

    }
}