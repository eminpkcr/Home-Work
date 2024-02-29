package A_1HW.class4;

import java.util.Scanner;

public class T4hw {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print “The temperature is
        the city __ is __”
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the city");
        String city=scan.nextLine();

        System.out.println("Enter the temperature in Fahrenheit");
        double fah=scan.nextDouble();
        double temp=(fah - 32) * 5/9;
        System.out.println("The temperature is the "+city+" "+"is "+temp );

    }
}
