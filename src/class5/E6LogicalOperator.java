package class5;

public class E6LogicalOperator {
    public static void main(String[] args) {

//        System.out.println(true || true ||false);

        int age=17;
        /*if (age<18 || age>60){
            System.out.println("You will get a discount");
        }*/

//        if gender is F or age > 60 you will get discount


        char gender='F';
        String name="Sara";


        if (gender=='F'||age>60 ||name!="Sara"){
            System.out.println("you will get discount");
        }


    }
}
