package class9;

public class E5Arrays {
    public static void main(String[] args) {


  /*
      create a loop that starts from 0 and it goes till the number 5 and print only the even numbers
         */


       int [] numbers={0,1,2,3,4,5};

        for (int i = 0; i < numbers.length; i+=2) {
           // if (i%2==0)

                System.out.print(numbers[i]+"  ");
            }
        /*
        we can do like this
          for (int i = 0; i < numbers.length; i+=2)
          and ignore the if part
         */

        System.out.println();
        System.out.println();


        /*
        create an array of  chars and you have to print all the chars on even indexes

         */
          char [] chars={'A','B','C','D','E'};
        for (int i = 0; i < chars.length; i++) {
            if (i%2==0){
                System.out.print(chars[i]+" ");
            }

        }
      /*
        we can do like this
           for (int i = 0; i < chars.length; i++)
          and ignore the if part
         */
        }



    }



