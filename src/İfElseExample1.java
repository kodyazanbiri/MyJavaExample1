import java.util.Scanner;

public class İfElseExample1 {
        // founding the  largest number that enter by user
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a integer number: ");
            int number1=scan.nextInt();
            System.out.println("Enter the second integer number: ");
            int number2=scan.nextInt();

            if(number1==number2 && number1==0){
                System.out.println("Number is zero that you entered ");
            }else if(number1==number2){
                System.out.println("Numbers entered are equal");
            } else if (number1>number2) {
                System.out.println("The first number is bigger than other number");
            }else if (number2>number1) {
                System.out.println("The second number is bigger than other number");
            }else
                System.out.println("please enter a valid number ");
        }
    }

