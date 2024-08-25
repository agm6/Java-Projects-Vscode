public class Contact{
    
    private String contactName;
    private int phoneNumber;
    private String contactEmail;

    public Contact (String name, int number, String email){
        contactName = name;
        phoneNumber = number;
        contactEmail = email;
    }

    String getName(){
        return contactName;
    }

    int getNumber(){
        return phoneNumber;
    }

    String getEmail(){
        return contactEmail;
    }

}
