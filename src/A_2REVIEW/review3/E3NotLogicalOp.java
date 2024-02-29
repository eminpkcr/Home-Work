package A_2REVIEW.review3;

public class E3NotLogicalOp {
    public static void main(String[] args) {

        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Bye";

        if(!str.equals("Hello")) {
            System.out.println("Value of the string is NOT hello");
        }

        boolean confirmSelected=true;

        if(!confirmSelected) {
            System.out.println("Let's click on confirm checkbox");
        }

        System.out.println("Click on Pay button");

    }
}
