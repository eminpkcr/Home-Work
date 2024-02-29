package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

      /*  //to print all whole number from 15 to 30

        int number=15;
        while (number<=30){
            System.out.println(number);
            number++;
        }
*/
        //to print all whole number from a starting point to an ending point
//        ask the user for starting and ending number

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting point,ending point and the step  ");
        int start=scan.nextInt();
        int end=scan.nextInt();


        int counter=start;


        while (counter<=end){
            System.out.println(counter);
            counter++;
        }

    }

}
