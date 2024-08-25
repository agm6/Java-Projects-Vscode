import java.util.HashMap;
import java.util.Scanner;

public class Phonebook{

    public static void main(String[] args){

        HashMap<String, Contact> phoneBook = new HashMap<String, Contact>();
        phoneBook.put("John James", new Contact("John James", 10, "john@james"));
        phoneBook.put("Jim James", new Contact("Jim James", 11, "jim@james"));
        phoneBook.put("Jill James", new Contact("Jill James", 12, "jill@james"));

        Scanner n = new Scanner(System.in);
        System.out.println("Enter name, number, email");
        String name2 = n.nextLine();
        int number2 = Integer.parseInt(n.nextLine());
        String email2 = n.nextLine();
        
        //n.close();

        phoneBook.put(name2, new Contact(name2, number2, email2));



        Contact var = phoneBook.get(name2);
        System.out.println(var.getNumber());
    }
}