import java.util.Scanner;
import java.util.Random;

public class NumberGuesser{

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {

        while(true){
        
            System.out.println("Guess a number between 1 and 10:");
            int guess = input.nextInt();

            int n = rand.nextInt(10) + 1;

            if(guess == n){
                break;
            }
            else if(guess >= n){
                System.out.println("Thats too high! Try again");
            }
            else if(guess <= n){
                System.out.println("Thats too low! Try again.");
            }

        }
    }
    
}