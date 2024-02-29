package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolates=true;
        boolean flowers=false;
        if (chocolates||flowers){
            System.out.println("I'm happy");
        }else {
            System.out.println("I'm sad");
        }
        boolean fiveG=true;
        boolean wifi=false;
        if (wifi||fiveG){
            System.out.println("you can connect the internet");
        }else {
            System.out.println("you can't connect the internet");
        }
    }
}
