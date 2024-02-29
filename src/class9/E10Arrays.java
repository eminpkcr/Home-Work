package class9;

public class E10Arrays {
    public static void main(String[] args) {
        //
        int[] numbers = {45, 50, 20, 30, -50, 45};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            System.out.println(number);
        }
        System.out.println();
        System.out.println();


        int[] numbers1 = {45, 50, 20, 30, -50, 45};
        for (int number : numbers1) {

            System.out.println(number);
    }
}}