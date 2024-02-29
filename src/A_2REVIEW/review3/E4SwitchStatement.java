package A_2REVIEW.review3;

public class E4SwitchStatement {
    public static void main(String[] args) {

        String color="GReen"; //GREEN, Green, GReen, grEEn

        System.out.println(color.toLowerCase());

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color, action is also unknown");
        }

    }
}


