package class9;

public class E3Arrays {
    public static void main(String[] args) {


        double [] numbers={10.5,5.5,0.05,100.5,586};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("------------------------------------------");

        // short way we can use loops
        for (int i = 0; i <=4; i++) {
            System.out.println(numbers[i]);

            //numbers.length gives us the total count of elements in an array
            System.out.println(numbers.length);

            System.out.println("-----------------------------------");

            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[j]);

            }

        }


    }


}
