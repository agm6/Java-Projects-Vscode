import java.util.Arrays;
import java.util.Scanner;

//LOGIC: compare first array to array made from user guess and return the letters that are correct.

public class Hangman{
    public static void main(String[] args){

        String wordToGuess = "apple";
        String[] letters = wordToGuess.split("");

        String[] wordDisplayed = new String[letters.length];
        for(int i = 0; i < wordDisplayed.length; i++){
            wordDisplayed[i] = "_";
        }

        boolean blanks = false;

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your guess: ");
            String guess = scan.nextLine();

            for(int i = 0; i < letters.length; i++){
                if(letters[i].equals(guess)){
                    System.out.println("You guessed correct!");
                    wordDisplayed[i].equals(guess);
                    System.out.println(Arrays.toString(wordDisplayed));

                    for(int j = 0; j < wordDisplayed.length; i++){
                        if(wordDisplayed[j].equals("_")){
                            blanks = true;
                        }
                    }
                    if(!blanks){
                        System.out.println("You win!");
                        break;
                    }

                }
                else{
                    System.out.println("You guessed wrong!");
                    continue;
                }
            }
         }

    }
}