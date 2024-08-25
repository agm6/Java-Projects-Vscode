import java.util.HashMap;

public class Phonebook{

    public static void main(String[] args){

        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        phoneBook.put("John James", 10);
        phoneBook.put("Jim James", 11);
        phoneBook.put("Jill James", 12);

        System.out.println(phoneBook);
    }
}