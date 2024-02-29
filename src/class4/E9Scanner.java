package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {

       Scanner bc=new Scanner(System.in);
        System.out.println("Are you hungry enter true/false");

        boolean hungry=bc.nextBoolean();
        if (hungry){
            System.out.println("Let's order Pizza");
        }else {
            System.out.println("Let's practice java");
        }


    }
}
