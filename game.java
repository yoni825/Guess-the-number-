import java.util.Scanner;
import java.util.Random;

    public class game{
        public static void main (String[] args) {

            Random random = new Random();
            int number = random.nextInt(100) + 1;
            int guess = 0;

            Scanner scanner = new Scanner(System.in);

           while (guess !=number) {
                System.out.println("Guess a number between 1 and 100:");

            guess = scanner.nextInt();

            if (guess > number){
                System.out.println("You guessed too high. Try again.");
            }
            else if (guess < number){
                System.out.println("You guessed too low. Try again.");
            }

            else if (guess == number){
                System.out.println("You guessed the right number! You win!");
            }
            else {
                System.out.println("You did not pick a number. Please try again.");
            }


        }
        
        scanner.close();

    }
}
