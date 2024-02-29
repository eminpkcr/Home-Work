package A_1HW.class2;

public class Variables {
    public static void main(String[] args) {

// Create a Java program and name it Variables
// In your program create different type of variables to store student’s information
// (name, last name, grade, city, state, phone number) and then print value of those variables in the format:
// My name is  and my  last name is __
// I am A/B student
// I live in city and state__
// And my phone number is …..

         String name="emin";
         String lastname="pekacar";
         char grade='A';
         String city="Crofton";
         String state="Maryland";
         String phone= "+12407583509";
        System.out.println("my name is "+name+" "+"and my last name is "+lastname);
        System.out.println("I'm "+grade+" student");
        System.out.println("I live in "+city+" "+"and state "+state);
        System.out.println("and my phone number is "+phone);

        /**
         * TASK 3
         * Change student’s city, state, phone number and grade. And print those updated values:
         * Example:
         * My name is and I moved to new city and new state. My new phone number is
         */

        name="emin";
       lastname="pekacar";
       grade='B';
       city="dallas";
       state="Texas";
       phone="+12407583506";
        System.out.println("My Name is "+name+" " +lastname+" and I moved new city "+city+" and new state is "+state+" "+"My phone number is "+phone);






    }
}
