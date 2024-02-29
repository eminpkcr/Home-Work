package class4;


import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary=sc.nextInt();
          // for int type of data we should be using nextInt() method
        if (salary>100000){

            System.out.println("you are rich");
        }else {
            System.out.println("Look for better opportunities ");
        }


    }
}
