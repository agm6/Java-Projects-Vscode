import java.util.HashMap;

public class Phonebook{

    public static void main(String[] args){

        HashMap<String, Contact> phoneBook = new HashMap<String, Contact>();

        phoneBook.put("John James", new Contact("John James", 10, "john@james"));
        phoneBook.put("Jim James", new Contact("Jim James", 11, "jim@james"));
        phoneBook.put("Jill James", new Contact("Jill James", 12, "jill@james"));

        Contact var = phoneBook.get("John James");
        System.out.println(var.getName());
    }
}