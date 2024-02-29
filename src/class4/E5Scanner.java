package class4;


import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        /*
        Scanner => is a class (which know how to take input from the keyboard)
        Scan => is a variable of type scanner just like we create a variable of type String
        New => is a special keyword which the object of a class
        Scanner again with()
        System.in => means we want to use the scanner class for taking the user input
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = scan.next();
        // calling the name method to take a string from the user
        System.out.println("You are amazing " + name);

        System.out.println("what is your age");
        int age = scan.nextInt();
        System.out.println("your age is " + age);

        System.out.println("enter your height");
        double height = scan.nextDouble();
        System.out.println("your height "+height);

        System.out.println("person detail=== his name is "+name+" his age is "+age+" his height is "+height);



    }
}
