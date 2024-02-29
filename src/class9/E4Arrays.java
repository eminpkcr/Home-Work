package class9;

public class E4Arrays {
    public static void main(String[] args) {


  /*
        create an array of Strings store 5 names in that array
        print all of the names from that array with the help of a for loop
        try printing with the help of a while loop as well
         */


        String [] names={"ahmet","veli","selim","dervis","hasan"};
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {

            System.out.print(names[i]+"  ");


        }


        System.out.println();
         int index=0;
        while (index< names.length){
            System.out.print(names[index]+"  ");
            index++;

        }


    }


}
