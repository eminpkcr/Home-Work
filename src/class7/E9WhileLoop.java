package class7;

public class E9WhileLoop {
    public static void main(String[] args) {


        // print 25 20 15 10 5 using a while loop

      /*  int counter=25;
        while (counter>=5){
            System.out.println(counter);
            counter-=5;
        }*/


        // print 25 20 15 10 5 using a while loop

        int num1 = 25;
        while (num1 >= 5) {
            if (num1!=15 ) {
          //  if (num1!=15 && num1!=10) {  if you don't output 15 we should use not equal 15 or if you don't output 15 and 10 should use and operator
                System.out.println(num1);

            }
            num1-=5;

        }
    }
}