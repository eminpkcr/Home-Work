package class10;



/*
Create an array of integers and calculate the sum of all elements
in an array

from an array of integer elements find the largest number
 */
public class Task6 {
    public static void main(String[] args) {

        int [] numbers={10,20,30,50};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            sum = sum + num;
        }
        System.out.println(sum);

    }
}
