import java.util.Scanner;
import java.util.Random;

public class NumberGuesser{

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        while(true){
        
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number between 1 and 10:");
            int guess = input.nextInt();
            //input.close();

            if(guess == n){
                System.out.println("Thats correct! You win!");
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