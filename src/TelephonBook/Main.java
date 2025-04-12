package TelephonBook;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Ivanov","123-12-11");
        phonebook.addContact("Petrov", "321-32-21");
        phonebook.addContact("Sidorov", "456-65-54");
        phonebook.addContact("Ivanov", "654-45-45");
        phonebook.addContact("Petrov", "123-21-11");

        phonebook.allPrint();

        List<String> ivanov = phonebook.getContact("Ivanov");
        System.out.println("Number phone: " + ivanov);




    }
}
