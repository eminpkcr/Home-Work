package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender");

//        There is no direct method for the char data type in scanner class
//        we use a workaround we first use next method to make a String from the user
//        and user from that String we extract the first letter by passing
//        0 to the charAt() method


         // char gender=scan.next().charAt(0);
        char gender=scan.next().charAt(5);
        System.out.println("you entered "+gender);

    }
}
