package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {

        // String is a non-primitive data type. We can't use == sign
        // we have to use .equals sign

        String name = "Emin";
//        if (name == "Emin") NOT work
        if (name.equals("Emin")) {

            System.out.println("I like swimming");

        } else {
            System.out.println("I like programming");
        }
    }


}

