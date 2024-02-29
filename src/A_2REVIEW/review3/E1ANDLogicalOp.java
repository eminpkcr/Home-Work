package A_2REVIEW.review3;

public class E1ANDLogicalOp
{
    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean  loginClikable=true;

        if (loginButtonDisplayed&&loginClikable){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }


    }

}
