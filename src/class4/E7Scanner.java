package class4;

import java.util.Scanner;

public class  E7Scanner {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = pass.next();

        if (name.equals("Ali")) {
            System.out.println("Mac User");
        } else if (name.equals("Safyan")) {
            System.out.println("Naughty");
        } else if (name.equals("Halima")) {
            System.out.println("Best");

        } else if (name.equals("Axel")) {
            System.out.println("Bad Boy ");

        }


    }
}
