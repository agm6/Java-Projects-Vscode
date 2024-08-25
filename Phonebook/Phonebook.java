import java.util.HashMap;
import java.util.Scanner;

public class Phonebook{

    public static void main(String[] args){

        HashMap<String, Contact> phoneBook = new HashMap<String, Contact>();
        phoneBook.put("John James", new Contact("John James", 10, "john@james"));
        phoneBook.put("Jim James", new Contact("Jim James", 11, "jim@james"));
        phoneBook.put("Jill James", new Contact("Jill James", 12, "jill@james"));


        System.out.println("Would you like to:\n1)Look up someone.\n2)Add a new contact.");

        Scanner n = new Scanner(System.in);
        int choice = Integer.parseInt(n.nextLine());

        if(choice == 1){
            System.out.println("Please enter the name of the person you are looking for:");
            String name = n.nextLine();
            //System.out.println(name);
            Contact var = phoneBook.get(name);
            System.out.println(var.toString());
        }
        else{
            System.out.println("Enter name, number, email");
            String name2 = n.nextLine();
            int number2 = Integer.parseInt(n.nextLine());
            String email2 = n.nextLine();
            //n.close();

            phoneBook.put(name2, new Contact(name2, number2, email2));

            Contact var = phoneBook.get(name2);
            System.out.println(var.toString());
        }
    }
}