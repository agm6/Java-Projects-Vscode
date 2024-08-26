import java.util.Arrays;
import java.util.Scanner;

//LOGIC: compare first array to array made from user guess and return the letters that are correct.

public class Hangman{
    public static void main(String[] args){
        String wordToGuess = "apple";
        String[] letters = wordToGuess.split("");
        /*for(String s : letters){
            System.out.println(s);
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        String guess = scan.nextLine();
        String[] guessLetters = guess.split("");

        if(Arrays.equals(letters, guessLetters)){
            System.out.println("You were correct!");
        }
        else{
            System.out.println("You were wrong!");
        }

    }
}