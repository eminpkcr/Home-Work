package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        /*
        create a variable money store the value 20000 inside that variable
        write if-else if money grater than 10000 program should check another condition,
         for example, it should check what day is today if the day is Sunday it should say
         let's go shopping
         */

        int money = 5000;
        String day = "Monday";
        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("let's go shopping");

            } else {
                System.out.println("let's wait sunday");
            }


        }else {
            System.out.println("lets save more");

        }

    }
}






