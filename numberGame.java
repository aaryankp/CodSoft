import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        System.out.println("Hello buddy! \n We are gonna play a number game in which system will randomly choose a number b/w 1 to 100 & you need to guess \n You will be given 3 chances per game" );
        Random ra=new Random();
        int ran=ra.nextInt(100) +1;
        System.out.println("____________Game Started____________");
        for(int i=0;i<3;i++) {
            System.out.print("Guess the number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (ran == n) {
                System.out.println("Your guess is correct");
                break;
            } else if ((ran-n)>=(-10) && (ran - n)<= 10) {
                System.out.println("Too Close to guess! Try again...");
            } else if ((ran - n) < (-10) || (ran - n) > 10) {
                System.out.println("Too away to guess! Try Again...");
            }
        }
    }
}
