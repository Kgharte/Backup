import java.util.Scanner;
import java.util.Random;
public class Program8 {
    public static void main(String args[]) {
        Random rand = new Random();
        int numberGuess = rand.nextInt(10);//Set Bound 50

        Scanner sc = new Scanner(System.in);
        int guess;
        boolean target =false;

        while (target == false) {
            System.out.println("Enter The number between 1 snd 50");
            guess = sc.nextInt();

            if (guess == numberGuess) {
                System.out.println("Number guessed is match with original number ");
                break;
            } else if (guess > numberGuess) {
                System.out.println("Number guessed is more than original number ");
            } else if (guess < numberGuess) {
                System.out.println("Number guessed is less than original number ");
            }
        }
    }
}
