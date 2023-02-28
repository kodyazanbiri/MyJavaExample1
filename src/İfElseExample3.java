public class İfElseExample3 {
    //nested if statement
    public static void main(String[] args) {

        int speed=110;

        if(speed>90){
            System.out.println("you're on the radar");
            if(speed>=90 && speed<=120)
                System.out.println("your penalty is 200 TL");
            else if(speed>=120)
                System.out.println("your penalty is 400 TL");
        }
        else
            System.out.println("your speed is normal");

    }
}
