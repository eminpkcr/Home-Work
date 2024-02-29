package class9;

public class E8Arrays {
    public static void main(String[] args) {

//        print all the numbers from 6 to 0 in reverse order
//        6 5 4 3 2 1 0

        int [] numbers={6,5,4,3,2,1,0};
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println();
        System.out.println();

        int [] num={0,1,2,3,4,5,6};
        for (int i = 6; i >=0 ; i--) {
            System.out.println(num[i]);
            
        }
        System.out.println();
        System.out.println();

        char[] chars={'A','B','C','D','E','F'};
//        for (int i = chars.length-1; i >= 0 ; i--)
        for (int i = 5; i >= 0 ; i--) {
            System.out.println(chars[i]);

        }
        }



    }



