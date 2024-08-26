
public class Hangman{
    public static void main(String[] args){
        String wordToGuess = "apple";
        String[] letters = wordToGuess.split("");
        for(String s : letters){
            System.out.println(s);
        }
    }
}