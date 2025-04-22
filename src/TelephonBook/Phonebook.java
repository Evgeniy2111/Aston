package TelephonBook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private static HashMap<String, List<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void addContact(String name, String number) {
       if (!phonebook.containsKey(name))
           phonebook.put(name, new ArrayList<>());
        phonebook.get(name).add(number);
    }

    public List<String> getContact(String name) {
        return phonebook.getOrDefault(name, new ArrayList<>());
    }

    public void allPrint() {
        for (HashMap.Entry<String, List<String>> entry : phonebook.entrySet()) {
            String name = entry.getKey();
            List<String> number= entry.getValue();
            System.out.println("Contact: "  + name + ": \nnumber/s: " + number + "\n");
        }
    }
}

