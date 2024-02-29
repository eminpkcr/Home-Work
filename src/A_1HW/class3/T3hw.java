package A_1HW.class3;

public class T3hw {
    public static void main(String[] args) {
        /*
         Create a Java program to store 2 values for expected and actual hours.
         Your program should check if expected hours are more than
         actual the program should print “You will love the course and you will succeed”,
         otherwise “Course will be very hard for you!”
         */

        int expected=24;
        int actual=19;
        if (expected>actual){
            System.out.println("You will love the course and you will succeed");
        }else{
            System.out.println("Course will be very hard for you!");
        }

    }
}
