package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {


        // ask the user to enter numbers if user enters any number
        // other than  -1 print "try again" and keep asking the user for a number
        // the moment user enters the number -1 the loop should stop

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scan.nextInt();

        while (number!=-1){
            System.out.println("try again");
            number= scan.nextInt();
        }




    }

}
