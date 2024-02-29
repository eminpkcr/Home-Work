package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {

      /*  Scanner scanner=new Scanner(System.in);
        String sentence=scanner.next();
        System.out.println(sentence);
        */

//        If we want to take a complete line from the user,
//        we should use nextLine method

      Scanner scan=new Scanner(System.in);
      String sentence=scan.nextLine();
        System.out.println(sentence);

    }
}
