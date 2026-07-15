package Collections.AddressBook;

import java.util.*;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    // Add Contact
    public void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    // Search Contact
    public void searchContact(String name) {

        Contact c = map.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact Not Found.");
    }

    // Delete Contact
    public void deleteContact(String name) {

        Contact c = map.remove(name);

        if (c != null) {

            contacts.remove(c);
            phoneSet.remove(c.phone);

            System.out.println("Contact Deleted.");

        } else {

            System.out.println("Contact Not Found.");
        }
    }

    // Display Contacts Sorted by Name
    public void displayContacts() {

        Collections.sort(contacts, new Comparator<Contact>() {

            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }

        });

        System.out.println("\n----- Address Book -----");

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact("Apeksha", "9876543210", "apeksha@gmail.com");
        book.addContact("Rahul", "9999999999", "rahul@gmail.com");
        book.addContact("Ankit", "8888888888", "ankit@gmail.com");

        // Duplicate Phone
        book.addContact("Riya", "9876543210", "riya@gmail.com");

        System.out.println("\nSearching Rahul...");
        book.searchContact("Rahul");

        System.out.println("\nDeleting Rahul...");
        book.deleteContact("Rahul");

        System.out.println("\nDisplaying Contacts...");
        book.displayContacts();
    }
}