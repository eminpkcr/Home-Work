package A_2REVIEW.review4;

public class E4NestedLoops {
    public static void main(String[] args) {


        System.out.println("--------ODOMETER--------");

       /* for (int a = 0; a <=9; a++) {
            for (int b = 0; b <=9 ; b++) {
                for (int c = 0; c <=9 ; c++) {
                    System.out.println(a+" "+b+" "+c);

                }

            }

        }*/
        System.out.println("--------WHAT IS THE OUTPUT----------");

       /* for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("hello");

            }
            System.out.println("bye");
            break;
        }*/

       /* for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("hello");
                break;
            }
           System.out.println("bye");

        }*/

      /*  for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("hello");
                break;
            }
            System.out.println("bye");
            break;
        }

*/

     /*   for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==2){
                    continue;
                }
                System.out.println("hello");

            }
            System.out.println("bye");

        }*/

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==2){
                    continue;
                }
                System.out.println("hello");

            }
            System.out.println("bye");

        }

    }
}