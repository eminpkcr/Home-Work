package A_1HW.class7;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        /*
        Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your birth month ");
        String num=scanner.next();

        if(num.equals("March") || num.equals("April") || num.equals("May")){
            System.out.println("You were born in spring Season");
        }else if(num.equals("June") || num.equals("July") || num.equals("August")){
            System.out.println("You were born in Summer Season");
        }else if(num.equals("September") || num.equals("October") || num.equals("November")){
            System.out.println("You were born in fall season");
        }else if(num.equals("December") || num.equals("January") || num.equals("February")){
            System.out.println("You were born in winter season");
        }

    }
}
