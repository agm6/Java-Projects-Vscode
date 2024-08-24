//This number guesser is an exercise to refresh myself on the basics of Java.

//It works by taking a random number between 1 and 10 and a number from a user.
//The two are compared and if they are the same then the user wins.
//If they are different then the user is given hints on how close they were.

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser{

    public static void main(String[] args) {


        //Random is used here to pick a number between 1 to 10 and save it to the integer n.
        //1 is added to n because the fucntion nextInt(10) selects from the range 0 to 9, so this is needed to make it 1 to 10.
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        //This integer holds the amount of times the user has guessed during a game.
        int counter = 0;

        //This loop is used to keep the game going in the event of a wrong answer.
        while(true){
        
            //Scanner is used here to collect a number from the user and save it to the integer guess.
            //The scanner isn't closed because doing so interferes with the game loop. 
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number between 1 and 10:");
            int guess = input.nextInt();
            //input.close();

            //These if statements compare the user's guess to the random number.
            //If the user is correct the game ends with a win message and their number of guesses diplayed.
            //If not, the counter increments and they are told their guess is either too high or too low and to try again.
            if(guess == n){
                System.out.println("Thats correct! You won in "+counter+" guesses!");
                break;
            }
            else if(guess >= n){
                System.out.println("Thats too high! Try again.");
                counter++;
            }
            else if(guess <= n){
                System.out.println("Thats too low! Try again.");
                counter++;
            }

        }
    }
    
}