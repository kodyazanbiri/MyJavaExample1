import java.util.Scanner;

public class SwitchExample {
    //letter grades
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your note: A,B,C,D,F");
        String note= scan.next();

        switch(note){
            case "A":
                System.out.println("your letter grade A : you passed ");
                break;
            case "B":
                System.out.println("your letter grade B : you passed");
                break;
            case "C":
                System.out.println("your letter grade C : you passed");
                break;
            case "D":
                System.out.println("your letter grade D : you passed");
                break;
            case "F":
                System.out.println("your letter grade F : you failed");
                break;
            default:
                System.out.println("you entered an invalid grade");

        }

    }
}
