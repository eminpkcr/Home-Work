package A_1HW.class4;

public class T2hw {
    public static void main(String[] args) {
        /*You are a loan specialist, and you need to ask user what is the amount of loan
        is needed. If loan is less or equal to 200,000 then you would lend the money
        otherwise you would reject the client.*/

        int loan=250000;
        if (loan<=200000){
            System.out.println("Lend the money");
        }else {
            System.out.println("reject the client");
        }
    }
}
