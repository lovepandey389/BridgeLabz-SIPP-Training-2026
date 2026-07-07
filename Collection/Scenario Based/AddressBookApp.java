import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class Contact {

    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate Phone Number Not Allowed");
            return;
        }

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println("Contact Added Successfully");
    }

    public static void searchContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact != null) {
            System.out.println("Contact Found");
            System.out.println("Name : " + contact.name);
            System.out.println("Phone : " + contact.phone);
            System.out.println("Email : " + contact.email);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public static void deleteContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact == null) {
            System.out.println("Contact Not Found");
            return;
        }

        contacts.remove(contact);
        contactMap.remove(name);
        phoneNumbers.remove(contact.phone);

        System.out.println("Contact Deleted Successfully");
    }

    public static void displayContacts() {

        Collections.sort(contacts, new Comparator<Contact>() {

            public int compare(Contact c1, Contact c2) {
                return c1.name.compareTo(c2.name);
            }

        });

        System.out.println("\n----- Contact List -----");

        for (Contact contact : contacts) {

            System.out.println("Name : " + contact.name);
            System.out.println("Phone : " + contact.phone);
            System.out.println("Email : " + contact.email);
            System.out.println();

        }

    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");

        addContact("Amit", "9876543211", "amit@gmail.com");

        addContact("Neha", "9876543212", "neha@gmail.com");

        addContact("Riya", "9876543211", "riya@gmail.com");

        System.out.println();

        searchContact("Amit");

        System.out.println();

        deleteContact("Neha");

        displayContacts();

    }

}

// Collection	Purpose
// ArrayList	Stores contacts in order
// HashMap	Fast search using name
// HashSet	Prevent duplicate phone numbers
// Collections.sort()	Sort contacts alphabetically