package A_2REVIEW.review3;

public class E2OrLogicalOp {
    public static void main(String[] args) {

        boolean pictureDisplayed = false;
        String accountName = "Syntax!";

        if (pictureDisplayed || accountName.equals("Syntax")) {
            System.out.println("Login was sucessful");
        } else {
            System.out.println("User was not able to login");
        }
    }
}